package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {
	// root node of the tree
	public Node root;
	
	public Node root1; 	// defined to check identical tree

	// function to construct a binary tree from given array (Level order)
	public Node insertLevelOrder(int arr[], Node node, int i) {
		if (i < arr.length) {
			Node temp = new Node(arr[i]);
			node = temp;
			node.left = insertLevelOrder(arr, node.left, i * 2 + 1);
			node.right = insertLevelOrder(arr, node.right, i * 2 + 2);
		}
		return node;
	}

	// function to insert an element into a binary tree (level order)
	public void insertIntoTree(Node root, int element) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();

			if (tempNode.left == null) {
				tempNode.left = new Node(element);
				break;
			} else {
				queue.add(tempNode.left);
			}
			if (tempNode.right == null) {
				tempNode.right = new Node(element);
				break;
			} else
				queue.add(tempNode.right);
		}
	}
	/* #### Depth First Search #### */

	// inorder traversal of a binary tree (LNR)
	public void printInorder(Node root) {
		if (root != null) {
			printInorder(root.left);
			System.out.print(root.data);
			printInorder(root.right);
		}
	}

	// preorder traversal of a binary tree (NLR)
	public void printPreorder(Node root) {
		if (root != null) {
			System.out.print(root.data);
			printInorder(root.left);
			printInorder(root.right);
		}
	}

	// post order traversal of a binary tree (LRN)

	public void printPostOrder(Node root) {
		if (root != null) {
			printPostOrder(root.left);
			printPostOrder(root.right);
			System.out.print(root.data);
		}
	}

	// ### Breadth First Search ###
	// level oder traversal of a binary tree (using Queue)
	public void printLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data);
			System.out.print(" ");

			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
	}
	// Find the first occurred node in binary tree

	public boolean isPresent(Node root, int element) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			if (tempNode.data == element) {
				return true;
			}
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
		return false;
	}

	// Find Left and Right most note using recursion
	public Node findRightMostNode(Node root) {
		if (root == null) {
			return null;
		}

		if (root.right == null) {
			return root;
		}

		return findRightMostNode(root.right);
	}

	public Node findLeftMostNode(Node root) {
		if (root == null) {
			return null;
		}

		if (root.right == null) {
			return root;
		}

		return findLeftMostNode(root.left);
	}

	// Finding leftmost and rightmost node using iteration

	public Node findRightMostUsingIteration(Node root) {
		Queue<Node> queue = new LinkedList<>();
		Node tempNode = null;
		queue.add(root);
		while (!queue.isEmpty()) {
			tempNode = queue.poll();
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
		return tempNode;
	}

	public Node findLeftMostUsingIteration(Node root) {
		Queue<Node> queue = new LinkedList<>();
		Node tempNode = null;
		queue.add(root);
		while (!queue.isEmpty()) {
			tempNode = queue.poll();
			if (tempNode.left != null)
				queue.add(tempNode.left);
		}
		return tempNode;
	}

	// Delete deepest right node
	public void deleteDepestNode(Node root, Node deepestNode) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			if (tempNode.right == deepestNode) {
				tempNode.right = null;
			} else
				queue.add(tempNode.right);
		}
	}

	// delete a node in binary tree
	public void deleteNode(Node root, int key) {
		Queue<Node> queue = new LinkedList<>();
		Node dummyNode = null;
		Node tempNode = root;
		queue.add(tempNode);
		while (!queue.isEmpty()) {
			tempNode = queue.poll();
			if (tempNode.data == key) {
				dummyNode = tempNode;
			}
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
		int x = findRightMostNode(root).data;
		dummyNode.data = x;
		deleteDepestNode(root, findRightMostNode(root));
	}

	// Sum of all nodes
	public int sumOfAllNodes(Node root) {
		Queue<Node> queue = new LinkedList<>();
		int sum = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			sum += tempNode.data;
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
		return sum;
	}

	// Sum of all the root nodes
	public int sumOfParentNodes(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		int sum = 0;
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			if (tempNode.left != null || tempNode.right != null) {
				sum += tempNode.data;
			}
			if (tempNode.left != null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right != null) {
				queue.add(tempNode.right);
			}
		}
		return sum;
	}
	
	// function to determaind if two arrays are identical
	public boolean isIdentical(Node root1, Node root2) {
		if(root1==null && root2==null) {
			return true;
		}
		
		if(root1!=null && root2!=null) {
			return (root1.data==root2.data && isIdentical(root1.left, root2.left)&&isIdentical(root1.right, root2.right));
		}
		return false;
	}
	// recursive function to determind the maximum height/depth of a tree
	
	public int maxHeight(Node node) {
		if(node==null) {
			return 0;
		}
		else 
        { 
            /* compute the depth of each subtree */
            int lDepth = maxHeight(node.left); 
            int rDepth = maxHeight(node.right); 
   
            /* use the larger one */
            if (lDepth > rDepth) 
                return (lDepth + 1); 
             else 
                return (rDepth + 1); 
        } 
	}
}
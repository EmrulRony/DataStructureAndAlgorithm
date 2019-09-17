package Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

// Construct the node of a binary tree
// A binary tree node has a left node and a right node
class Node {
	Node right, left;
	int data;

	Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	Node() {

	}
}

class iiBinaryTree {
	// root node of the tree
	Node root;

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
		
		while(!queue.isEmpty()) {
			Node tempNode=queue.poll();
			
			if(tempNode.data==element) {
				return true;
			}
			
			if (tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if (tempNode.right!=null) {
				queue.add(tempNode.right);
			}
			
		}
		return false;
	}
}

public class iiImplBinaryTreeLevelOrder {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		iiBinaryTree btree = new iiBinaryTree();

		btree.root = btree.insertLevelOrder(arr, new Node(), 0);

		btree.insertIntoTree(btree.root, 11);
		btree.printLevelOrder(btree.root);
		btree.printPostOrder(btree.root);
		
		System.out.println();
		System.out.println(btree.isPresent(btree.root, 12));

	}
}

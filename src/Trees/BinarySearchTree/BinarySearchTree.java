package Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	public Node root;
	
	// Constructing a BST by given level order traversal
	public Node constructLevelOrder(int arr[],Node root) {
		for(int i=0; i<arr.length;i++) {
			root=insertLevelOrder(root, arr[i]);
		}
		return root;
	}
	
	public Node insertLevelOrder(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}
		
		if(data<=root.data) {
			root.left=insertLevelOrder(root.left,data);
		}
		else {
			root.right=insertLevelOrder(root.right,data);
		}
		return root;
	}
	
	// Level order traversal of BST
	public void PrintLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.print(tempNode.data+" ");
			if(tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
	}
	
	// Searcing an element in level order
	public Node search(Node root, int key) {
		if(root.data==key || root==null) {
			return root;
		}
		if (key<root.data) {
			root=search(root.left, key);
		}
		else {
			root=search(root.right, key);
		}
		return root;
	}
	
	// Inserting a node in BST
	public Node insert(Node root, int data) {
		if (root==null) {
			return new Node(data);
		}
		if (data<root.data) {
			root.left=insert(root.left,data);
		}
		else {
			root.right=insert(root.right,data);
		}
		return root;
	}
	
	/*Delete a node from a binary search tree*/
	public Node deleteNode(Node root, int key) {
		Node parent=null;
		Node curr=root;
		
		// Finding the parent and current node that match the key
		while(curr!=null && curr.data!=key) {
			parent=curr;
			if (key<curr.data) {
				curr=curr.left;
			}
			else {
				curr=curr.right;
			}
		}
		if(curr==null) {
			return root;
		}
		
		// Case1: if curr is the leaf node
		if(curr.left==null && curr.right==null) {
			
				if(parent.left==curr) {
					parent.left=null;
				}
				else {
					parent.right=null;
				}
		
		}
		// Case2: If curr node has two child node
		else if(curr.left!=null && curr.right!=null) {
			Node successor = inOrderSuccessor(curr.right);
			int x= successor.data;
			deleteNode(root, x);
			curr.data=x;
		}
		// Case3: If curr has only one child node
		else {
			Node child=null;
			if(curr.right==null) {
				child=curr.left;
				curr.data=child.data;
				curr.left=null;
				
			}
			else {
				child=curr.right;
				curr.data=child.data;
				curr.right=null;
			}
		}
		return root;
	} 
	
	public Node inOrderSuccessor(Node node) {
		if(node.left==null) {
			return node;
		}
		return inOrderSuccessor(node.left);
	}
	
}

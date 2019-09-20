package Trees.BinaryTree;


//Construct the node of a binary tree
//A binary tree node has a left node and a right node
public class Node {
	public Node right, left;
	public int data;

	public Node(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}

	public Node() {

	}
}
package Trees.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
	public Node root;

	public Node constructLevelOrder(int arr[], Node root, int i) {
		Node tempNode=null;
		if (i<arr.length) {
			tempNode = new Node(arr[i]);
			if (tempNode.data <= root.data) {
				tempNode.left = constructLevelOrder(arr, tempNode.left, 2*i+1);
			} else {
				tempNode.right = constructLevelOrder(arr, tempNode.right, 2*i+1);;
			}
			
		}
		return tempNode;
	}
	
	public void PrintLevelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node tempNode = queue.poll();
			System.out.println(tempNode.data);
			if(tempNode.left!=null) {
				queue.add(tempNode.left);
			}
			if(tempNode.right!=null) {
				queue.add(tempNode.right);
			}
		}
	}

}

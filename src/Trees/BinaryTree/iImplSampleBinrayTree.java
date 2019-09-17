// Binary Tree: A tree whose elements have at most 2 children is called a binary tree.
// Since each element in a binary tree can have only 2 children,
// we typically name them the left and right child.
//
// This is the implementation of a sample binray tree
//     tree
//      ----
//       1    <-- root
//     /   \
//    2     3  
//   /   
//  4

package Trees.BinaryTree;


class BinaryTree {
	
	static class Node {
		int key;
		Node left, right;

		Node() {
		}

		Node(int key) {
			this.key = key;
			left = right = null;
		}
	}
	
	public Node root;

	BinaryTree() {
		root = null;
	}

	BinaryTree(int key) {
		root = new Node(key);
	}
}

public class iImplSampleBinrayTree {
	public static void main(String[] args) {
		BinaryTree btree = new BinaryTree(1);
		btree.root.left=new BinaryTree.Node(2);
		btree.root.right=new BinaryTree.Node(3);
		btree.root.left.left=new BinaryTree.Node(4);
		System.out.println(btree.root.left.left.key);
	}
}

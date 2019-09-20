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


class iBinaryTree {
	
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

	iBinaryTree() {
		root = null;
	}

	iBinaryTree(int key) {
		root = new Node(key);
	}
}

public class iImplSampleBinrayTree {
	public static void main(String[] args) {
		iBinaryTree btree = new iBinaryTree(1);
		btree.root.left=new iBinaryTree.Node(2);
		btree.root.right=new iBinaryTree.Node(3);
		btree.root.left.left=new iBinaryTree.Node(4);
		System.out.println(btree.root.left.left.key);
	}
}

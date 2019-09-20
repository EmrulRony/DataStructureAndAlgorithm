package Trees.BinaryTree;

public class MainDriverClass {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr1[]= {1,2,3,4,5,6,7,8,9,10}; // defined to check identical array
		
		BinaryTree btree = new BinaryTree();
		
		btree.root= btree.insertLevelOrder(arr, new Node(), 0);
		btree.root1= btree.insertLevelOrder(arr1, new Node(), 0); // defined to check identical array
		
//		btree.insertIntoTree(btree.root, 11);
		btree.printLevelOrder(btree.root);
		System.out.println();
		btree.printLevelOrder(btree.root1);
		
		/*check if two binary trees are identical or not*/
		if(btree.isIdentical(btree.root, btree.root1)) {
			System.out.println("\nTwo trees are identical");
		}
		else {
			System.out.println("\nTwo trees are not identical");
		}
		
		// max height of a tree
		btree.maxHeight(btree.root);
		
	}
}

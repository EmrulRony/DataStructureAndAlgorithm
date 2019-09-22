package Trees.BinarySearchTree;

public class MainDriverClass {
	public static void main(String[] args) {
		int arr[] = {7,4,12,3,6,8,1,5,10};
		BinarySearchTree bst= new BinarySearchTree();
		bst.root= bst.constructLevelOrder(arr, bst.root);
		bst.PrintLevelOrder(bst.root);
		
		// Search an element in BST
		if (bst.search(bst.root, 8)!=null) {
			 System.out.println("\nFound");
		}
		else
			System.out.println("\nNot in the BST");
		
		// Insert an element in BST
		
//		Node returnedNode = bst.insert(bst.root, 2);
//		bst.PrintLevelOrder(returnedNode);
		
		// Delete an element from BST
		bst.deleteNode(bst.root, 7);
		System.out.println();
		bst.PrintLevelOrder(bst.root);
	}
}

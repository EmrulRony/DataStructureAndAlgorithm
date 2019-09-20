package Trees.BinarySearchTree;

public class MainDriverClass {
	public static void main(String[] args) {
		int arr[] = {7,4,12,3,6,8,1,5,10};
		BinarySearchTree bts= new BinarySearchTree();
		bts.root= bts.constructLevelOrder(arr, new Node(arr[0]), 1);
		bts.PrintLevelOrder(bts.root);
	}
}

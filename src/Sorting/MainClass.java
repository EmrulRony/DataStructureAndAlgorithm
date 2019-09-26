package Sorting;

public class MainClass {
	public static void main(String[] args) {
		int arr[] = {12, 11, 13, 5, 6, 7};
		int arrSorted[] = {2,3,4,5,6,7,8};
		
//		int[] retArr=SelectionSort.sortIt(arr); // Test selection sorta
		
//		int[] bblSort=BubbleSort.sortItRecurse(arr,arr.length);
		
//		int [] insSort=InsertionSort.sortIt(arr);
		
		int[] mergeSort = MergeSort.sortIt(arr, 0, arr.length-1);
		
		for(int i=0;i<mergeSort.length;i++) {
			System.out.print(mergeSort[i]+" ");
		}
	}
}


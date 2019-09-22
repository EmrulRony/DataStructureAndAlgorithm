package Sorting;

public class MainClass {
	public static void main(String[] args) {
		int arr[] = {10,5,2,8,7,4,0,5};
		int arrSorted[] = {2,3,4,5,6,7,8};
		
//		int[] retArr=SelectionSort.sortIt(arr); // Test selection sorta
		
//		int[] bblSort=BubbleSort.sortItRecurse(arr,arr.length);
		
		int [] insSort=InsertionSort.sortIt(arr);
		
		for(int i=0;i<insSort.length;i++) {
			System.out.print(insSort[i]+" ");
		}
	}
}


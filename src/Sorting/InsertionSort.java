package Sorting;

// 5,2,6,1,7,7,3,10

class SortingClassInsertion {
	public static int[] sortMyArray(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp=arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			
				arr[j + 1] = temp;
		}
		return arr;
	}
}

public class InsertionSort {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 6, 1, 7, 7, 3, 10 };
		int res_arr[] = SortingClassInsertion.sortMyArray(arr);
		
		for (int i = 0; i < res_arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(",");
		}
	}
		
}

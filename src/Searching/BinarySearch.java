package Searching;

class BinaryDemoClass {
	public static int searchMet(int arr[], int number) {
		int left, right, mid;
		int len = arr.length;
		left = 0;
		right = arr.length - 1;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == number) {
				return mid;
			} else if (number < arr[mid]) {
				right = mid - 1;
			} else if (number > arr[mid]) {
				left = mid + 1;
			}
		}
		return -1;
	}
}

public class BinarySearch {
	public static void main(String[] args) {
		int number = 1;
		int arr[] = { 4, 5, 6, 8, 9, 11, 15, 17, 19, 20, 22, 23, 27, 29 };
		int res=BinaryDemoClass.searchMet(arr, number);
		
		if (res==-1) {
			System.out.println("Number not found!!");
		}
		else {
			System.out.println("Number found at indes:  "+res);
		}

	}

}

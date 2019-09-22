package Sorting;

public class BubbleSort {
	public static int[] sortIt(int arr[]) {
		boolean swaped = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swaped = true;
				}
			}
			if (swaped == false) {
				break;
			}
		}
		return arr;
	}
	
	public static int[] sortItRecurse(int arr[], int len) {
		if(len==1) {
			return arr;
		}
		
		for(int i=0;i<len-1;i++) {
			if (arr[i]>arr[i+1]) {
				int temp= arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		return sortItRecurse(arr,len-1);
	}
}

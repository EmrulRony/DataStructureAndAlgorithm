package Sorting;

public class MergeSort {

	public static int[] sortIt(int arr[], int left, int right) {
		
		if(left>=right) {
			return arr;
		}
		int mid = (left + right) / 2;
		sortIt(arr, left, mid);
		sortIt(arr, mid + 1, right);
		merge(arr, left, right, mid);
		return arr;
	}

	public static void merge(int arr[], int left, int right, int mid) {
		int sizeLeft= mid - left + 1;
		int siezeRight = right - mid;
		int[] leftArr = new int[sizeLeft];
		int[] rightArr = new int[siezeRight];
		int i = 0, j = 0;
		int k = left;
		
		for(int x=0;x<sizeLeft;++x) {
			leftArr[x]=arr[left+x];
		}
		for(int y=0;y<siezeRight;++y) {
			rightArr[y]=arr[mid+1+y];
		}
		while (i < sizeLeft && j < siezeRight) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while (i < sizeLeft) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}
		while (j < siezeRight) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

}

// Time complexity of MergeSort is O(nlogn)
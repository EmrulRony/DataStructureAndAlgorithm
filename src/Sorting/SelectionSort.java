package Sorting;

class SearchingClass{
	static int[] sortMet(int arr[]) {
		System.out.println("Arr len" + arr.length);
		
		for(int i=0;i<arr.length-1;i++) {
			int arrMin=i;
			for (int j=i+1;j<arr.length;j++) {
				if (arr[arrMin]>arr[j]) {
					arrMin=j;
				}
				if (arrMin!=i) {
					int temp = arr[arrMin];
					arr[arrMin]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
		return arr;
		
	}
}
public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {5,7,2,3,9,8,1,14,2};
		
		int resArr[]=SearchingClass.sortMet(arr);
		
		for(int i=0;i<=resArr.length-1;i++) {
			System.out.println(resArr[i]);
		}
	}
}

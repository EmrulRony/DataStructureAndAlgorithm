package Sorting;

class SortingClass{
	public static int[] sortId(int arr[]) {
		for(int x=0;x<arr.length;x++) {
			boolean swap=false;
			
			for (int i=0;i<arr.length-1;i++) {
				if (arr[i]>arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
					swap=true;
				}
			}
			if (swap==false) {
				break;
			}
		}
		return arr;
	}
}

public class BubbleSort {
	
	public static void main(String[] args) {
	 int elements[] = {5,2,1,6,8,2,8,9,0};
	 
	 int resArr[]= SortingClass.sortId(elements);
	 for(int i=0;i<resArr.length;i++) {
		 System.out.println(resArr[i]);
	 }
	}
}

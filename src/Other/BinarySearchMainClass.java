package Other;

class BinarySearch{
	
	static String searchMet(int arr[],int num) {
		int mid,left,right;
		left=0;
		right=arr.length-1;
		while(left<=right) {
			mid= (left+right)/2;
			if (arr[mid]==num) {
				return "Found number at "+mid;
			}
			else if (num<arr[mid]) {
				right=mid-1;
			}
			else if (num>arr[mid]) {
				left=mid+1;
			}
		}
		return "Number not found";
	}
}

public class BinarySearchMainClass {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,9,12,14,28,30,35};
		int num=30;
		String result = BinarySearch.searchMet(arr, num);
		System.out.println(result);
	}

}

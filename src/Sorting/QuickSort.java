package Sorting;

public class QuickSort{
	
	public static int[] quickSort(int arr[], int left, int right) {
		if (left>=right) {
			return arr;
		}
		int partitionPoint = partition(arr, left, right);
		quickSort(arr, left, partitionPoint-1);
		quickSort(arr, partitionPoint+1, right);
		return arr;
	}
    public static int partition(int arr[],int left,int right){
    	int pvot=arr[right];
        int p=left-1;
        int i;
        for( i=left;i<right;i++){
            if(arr[i]<pvot){
                p++;
                int temp=arr[p];
                arr[p]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[p+1];
        arr[p+1]=arr[right];
        arr[right]=temp;
        
        return p+1;
    }
    public static void main(String[] args) {
        int arr[]={10, 7, 8, 9, 1, 5};
        int arrRet[]=QuickSort.quickSort(arr,0,arr.length-1);

        for(int i=0;i<arrRet.length;i++){
            System.out.print(arrRet[i]+" ");
        }
    }
}

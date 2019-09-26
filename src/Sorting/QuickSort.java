package Sorting;

public class QuickSort{
    public static int[] quickSort(int arr[],int left,int right){
        int p=left-1;
        int i;
        for( i=0;i<right;i++){
            if(arr[i]<arr[right]){
                p++;
                int temp=arr[p];
                arr[p]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[p+1];
        arr[p+1]=arr[right];
        arr[right]=temp;
        
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={6,3,8,4,7,5};
        int arrRet[]=QuickSort.quickSort(arr,0,arr.length-1);

        for(int i=0;i<arrRet.length;i++){
            System.out.println(arrRet[i]);
        }
    }
}

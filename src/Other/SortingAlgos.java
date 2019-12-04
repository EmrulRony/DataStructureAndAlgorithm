package Other;

import Sorting.BubbleSort;

public class SortingAlgos {

    public static int[] selectionSort(int[] arr){
        // int[] newArr ={};
       for (int x =0; x<arr.length; x++){
           int min_index = x;
           boolean key = false;
        for (int i=x+1; i<arr.length; i++){
            if (arr[min_index]>arr[i]){
                min_index = i;
                key = true;
            }
        }
        if (key == true){
            int temp = arr[x];
            arr[x] = arr[min_index];
            arr[min_index] = temp;
        }
       }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,8,4,2,10,5,5};

        int res[] = selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(res[i]);
        }
    }
}
package Searching;

import java.util.Scanner;

public class SearchAlgo {
    static String linearSearch(int arr[], int num){ // time complexity of this function is O(n)
        boolean isFound = false;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == num){
                isFound = true;
                break;
            }
        }
        return (isFound)? "Found!":"Not int the list!";
    }

    static String binarySearch(int arr[], int key){
        boolean isFound = false;
        if(arr.length !=0){
            int left = 0;
            int right = arr.length-1;
            int mid = left + right/2;
            
            while (left <= right){
                System.out.println("Inside while");
                if( arr[mid] == key){
                    isFound = true;
                    break;
                }
                if ( key <arr[mid]){
                    right = mid-1;
                    mid = left+right/2;
                }
                if ( key> arr[mid]){
                    left = mid+1;
                    mid = left+right/2;
                }
            }
        }
        return (isFound)?"Found!":"Not in the list";
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8,9,10,11,12,12,14,15,16,17,18,19,20,21,22,23,24};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String msg = binarySearch(arr, num);
        System.out.println(msg);
    }
}


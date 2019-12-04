package Searching;

import java.util.Scanner;

class MyClass{
	public static void searchMet(int arr[],int number) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==number) {
				System.out.println("Number found at pos: "+arr[i]);
				return;
			}
		}
		System.out.println("Number not found!!");
	}
}

public class LinearSearch {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=Integer.parseInt(sc.nextLine());
		int arr[]= {2,8,12,1,29};
		MyClass.searchMet(arr, number);
	}
}
// Time complexity of this algorithm is O(n)

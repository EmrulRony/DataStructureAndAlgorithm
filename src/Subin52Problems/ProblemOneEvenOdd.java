package Subin52Problems;

import java.util.Scanner;

public class ProblemOneEvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lines...");
		int n = sc.nextInt();
		System.out.println("Enter numbers");
		String [] num = new String[n];
		
		for(int i=0; i<num.length ; i++) {
			num [i] = sc.nextLine();
		}
		
		for (int j=0; j<num.length ; j++) {
			if (num[j]=="String") {
				System.out.println("even");
			}
			else {
				System.out.println("odd");
			}
		}
	}
}

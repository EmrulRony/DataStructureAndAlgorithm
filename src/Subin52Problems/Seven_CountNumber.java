package Subin52Problems;

import java.util.Scanner;

public class Seven_CountNumber {
	
	public static void counter(String[] arr) {
		String currNum;
		for (int i =0; i<arr.length; i++) {
			currNum = arr[i].trim();
			String res[] = currNum.split(" ");
			System.out.println(res.length);
		}
	}
	
	public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int line = sc.nextInt();
        String arr[] = new String[line];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextLine();
            if(arr[i].equals("")) {
            	arr[i] = sc.nextLine();
            }
        }

        Seven_CountNumber.counter(arr);
    }
}

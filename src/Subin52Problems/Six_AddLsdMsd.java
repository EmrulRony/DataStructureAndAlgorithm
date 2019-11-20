package Subin52Problems;

import java.util.Scanner;

public class Six_AddLsdMsd{

    public static void adder(int[] arr){
        int currNum;
        int LSD;
        int MSD = Integer.MAX_VALUE;
        int remaining = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            currNum = arr[i];
            LSD = currNum % 10;
            while(remaining != 0){
                remaining= currNum / 10;
                MSD = currNum % 10;
                currNum = remaining;
            }
            System.out.println(LSD + MSD);
            remaining = Integer.MAX_VALUE;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int line = sc.nextInt();
        int arr[] = new int[line];

        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Six_AddLsdMsd.adder(arr);
    }
}
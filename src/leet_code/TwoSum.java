package leet_code;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//        You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//        Example:
//
//        Given nums = [2, 7, 11, 15], target = 9,
//
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // Method_1: Using iteration
    public static int[] twoSumUsingItr(int arr[], int target){
        int[] res = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
        }
        return res;
    }

    // Method_2: Using hashtable
    public static int[] twoSumUsingHashing(int arr[], int target) throws Exception {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        for (int i=0;i<arr.length;i++){
            int compliment = target-arr[i];
            if(hm.containsKey(compliment) && hm.get(compliment)!=i){
                return new int[] {compliment,arr[i]};
            }
        }
        throw new Exception("Target nof found");
    }

    public static void main(String[] args) throws Exception {
        int [] arr = {2,7,11,15};
        int[] newArr= TwoSum.twoSumUsingHashing(arr,18);
        System.out.println(newArr[0]+" "+newArr[1]);
    }
}

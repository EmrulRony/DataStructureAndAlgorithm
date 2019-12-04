package Other;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeetCode {
    static int[] calcMet(Map<Integer,Integer> map, int target){
        int arr[] = new int[2];
        boolean key = false;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            for (Map.Entry<Integer,Integer> entryAgain: map.entrySet()){
                if (entry.getValue()+entryAgain.getValue() == target){
                    arr[0] = entry.getKey();
                    arr[1] = entryAgain.getKey();
                    key = true;
                    break;
                }
            }
            if (key == true) break;   
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(i, arr[i]);
        }
        int res[] = calcMet(map, target);
        System.out.println(res[0] + " " + res[1]);
    }
}
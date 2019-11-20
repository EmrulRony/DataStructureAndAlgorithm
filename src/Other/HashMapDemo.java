package Other;

import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Emrul");
        map.put(2,"Hasan");

        // Set<Entry<Integer,String>> set=map.entrySet();

        // for(Entry<Integer,String> entry : set){
        //     System.out.println(entry.getValue());
        // }

        for (Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
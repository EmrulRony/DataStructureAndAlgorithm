package CollectionFramework;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEach{
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2, "Hasan");
        map.put(1, "Khan");

        map.forEach((K,V) -> System.out.println("Key: "+ K +" "+ " Value: "+ V));
    }
}
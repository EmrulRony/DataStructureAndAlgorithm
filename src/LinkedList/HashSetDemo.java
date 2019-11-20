package LinkedList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class HashSetDemo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add("Emrul");
        set.add("Emrul");
        set.add("Hasan");
        set.add("Khan");
        set.add(1);
        set.add(null);

        Iterator itr = set.iterator();

        while(itr.hasNext()){
          Object obj =  itr.next();
          System.out.println(obj);
        }
    }
}
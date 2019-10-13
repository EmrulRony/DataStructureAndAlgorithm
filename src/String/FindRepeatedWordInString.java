package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

// Problem 1: Find repeated characters in a sentence
// Problem 2: Find repeated words in a String

public class FindRepeatedWordInString {
	
	// This method counts num of times a char occurs in a string
	public static void findRepeatedChar(String str) {
		String newString= str.replace(" ", "");
		
		System.out.println(newString+" "+newString.length()+ " "+newString.charAt(2));
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(int i=0; i<newString.length(); i++) {
			if(hm.get(newString.charAt(i))!=null) {
				hm.put(newString.charAt(i),hm.get(newString.charAt(i))+1);
			}
			else
				hm.put(newString.charAt(i), 1);
		}
		
		Iterator<Entry<Character, Integer>> itr=hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	// This method count number of times a string occurs in an given string 
	public static void findRepeatedWord(String str) {
		String[] strings=str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String tempStr:strings) {
			if(hm.get(tempStr)!=null) {
				hm.put(tempStr, hm.get(tempStr)+1);
			}
			else {
				hm.put(tempStr, 1);
			}
		}
		
		Iterator<Entry<String, Integer>> itr= hm.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry<String, Integer> entry= itr.next();
			System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times");
		}
	}
	
	public static void main(String[] args) {
		String str= new String("I I love java java");
		findRepeatedChar(str);
	}
}

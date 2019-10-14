package String;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

// Remove Duplicates from a given string
// Sample input: Java || Output: Jav


// Method 1: Delete duplicate using hashing
public class RemoveDuplicatesFromString {
	
	// Method 1: Delete duplicate using hashing || time complexity O(n)

	public static void delDublicate(String str) {
		String newStr = str.replace(" ","");
		Set<Character> set = new LinkedHashSet<>(); 
		for(int i=0;i<newStr.length();i++) {
			set.add(newStr.charAt(i));
		}
		System.out.println(getResString(set));
	}
	
	public static String getResString(Collection<Character> collection) {
		String resStr="";
		for(Character ch: collection) {
			resStr+=ch;
		}
		return resStr;
	}
	
	// Method 2: Using iteration || time complexity O(n*2)
	
	public static void delDubUsingItr(String str) {
	    char[] ch=str.replace(" ", "").toCharArray();
	    char[] newChar= new char[ch.length];
	    
	    int index=0;
	    
	    for(int i=0;i<ch.length;i++) {
	    	int j;
	    	for(j=0;j<i;j++) {
	    		if(ch[i]==ch[j]) {
	    			break;
	    		}
	    	}
	    	if(i==j) {
	    		newChar[index++]=ch[i];
	    	}
	    }
	    
	    printCharsSec(newChar);
	}
	
	public static void printCharsSec(char[] ch) {
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}
	
	public static void main(String[] args) {
		String str= "I love Java";
		delDubUsingItr(str);
	}
}

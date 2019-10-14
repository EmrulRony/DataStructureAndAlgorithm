package String;

// Problem: Reverse a given String

public class ReverseGivenString {
	// Using iteration
	public static void reverseStringItr(String str) {
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
	
	// Using recursion
	public static void reverseStrUsingRecursion(String str) {
		char[] ch=str.toCharArray();
		int i=0;
		reverseMet(ch, i);
	}
	
	public static char[] reverseMet(char ch[],int i) {
		if(i<ch.length) {
			reverseMet(ch, ++i);
			System.out.print(ch[--i]);
		}
		return ch;
	}
	
	public static void main(String args[]) {
		String str="Emrul";
//		ReverseGivenString.reverseStrUsingRecursion(str);
		ReverseGivenString.reverseStringItr(str);
	}
}

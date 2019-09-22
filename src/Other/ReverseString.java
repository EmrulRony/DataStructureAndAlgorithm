package Other;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Hello world";
		System.out.println("Using built in API: "+reverseWithStringBuilder(str));
		System.out.println("Reverse manually: "+ reverseWithStringBuilder(str));
	}
	
	public static String reverseWithStringBuilder(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	public static String reverseManully(String str) {
		StringBuilder stb = new StringBuilder();
		for (int i=str.length()-1;i>-0;i--) {
			stb.append(str.charAt(i));
		}
		return stb.toString();
	}
}

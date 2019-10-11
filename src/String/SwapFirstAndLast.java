package String;

public class SwapFirstAndLast {
	static char[] swapMet(String str) {
//		char[] ch=str.toCharArray();
//		return ch;
		
		char[] ch = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
		}
		
		char temp= ch[ch.length-1];
		ch[ch.length-1]=ch[0];
		ch[0]=temp;
		return ch;
	}
	public static void main(String[] args) {
		String str="Hello World!";
		
		char[] ch =SwapFirstAndLast.swapMet(str);
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
	}
}

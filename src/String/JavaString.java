package String;

public class JavaString {
	public static void main(String[] args) {
		String str = new String("My Name Is Khan");
		String str2= "abc def ghi 	klm";
		StringBuffer strBuff = new StringBuffer();
		strBuff.append(str);
		
		System.out.println(str.charAt(3));
		System.out.println(str.substring(1,5));
		System.out.println(str.trim());
		
		System.out.println(str2.replaceAll("\\s", ""));
		
		
		for(String result: str2.split(" ")) {
			System.out.println(result);
		}
		
		
	}
}

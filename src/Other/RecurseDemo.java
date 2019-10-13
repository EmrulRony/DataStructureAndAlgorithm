package Other;

public class RecurseDemo {
	public static void myRecurse(int i) {
		if(i>=10) {
			return;
		}
		myRecurse(++i);
		System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println("sss");
		myRecurse(0);
	}

}

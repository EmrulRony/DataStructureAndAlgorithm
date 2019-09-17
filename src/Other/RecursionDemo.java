package Other;

public class RecursionDemo {
	public static void main(String[] args) {
		incMet(1);
	}
	static void incMet(int x) {
		if (x<=10) {
			x++;
			incMet(x);
			incMet(x);
		}
		System.out.println("The value of X: "+x);
	}
}

package Other;

public class TimeComplexityDemo {
public static void main(String[] args) {
	int n,count;
	n=3;
	count = 0;
	
	for (int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			for(int k=0;k<n;k++) {
				count++;
			}
		}
	}
	System.out.println(count);
}
}

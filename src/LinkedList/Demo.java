package LinkedList;

class Student{
	int studentId=000;
	String studentName="XXX";
	static Collge collage;

	
}

class Collge{
	static int collgeId=999;
	static String collgeName="YYY";

}

public class Demo {
	
	public static void main(String[] args) {
		Student obj = new Student();
		Student obj2 = new Student();
		
		
		
		
		
		obj.studentId=101;
		obj.studentName="Emrul";
		obj.collage.collgeId=106;
		obj.collage.collgeName="BTS";
		
		Collge clg = new Collge();
//		clg.collgeId=666;
//		clg.collgeName="BDDD";
		
		obj.collage=clg;
		
		System.out.println(obj.studentId+" "+ obj.studentName+" "+obj.collage.collgeId+" "+obj.collage.collgeName);
		
		
		
		System.out.println(obj2.studentId+" "+ obj2.studentName+" "+obj2.collage.collgeId+" "+obj2.collage.collgeName);
		
		

	}

}

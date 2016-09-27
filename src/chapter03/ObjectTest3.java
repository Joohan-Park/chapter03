package chapter03;

public class ObjectTest3 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = p1;
		Point p3 = new Point(10,20);

		
		Point1 p4 = new Point1(10,20);
		
		System.out.println(p1==p2);
		System.out.println(p2.equals(p1));
		
		System.out.println(p1==p3);
		System.out.println(p3.equals(p1));
		
		System.out.println(p3.equals(p4));
	
		
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		String s3 = "ABC";
		String s4 = "ABC";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
	
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		
		System.out.println(s3==s4);
	}

}

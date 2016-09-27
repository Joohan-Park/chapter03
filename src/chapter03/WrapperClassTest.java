package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(b);

		Integer i2 = new Integer("10");
		System.out.println(i2);
		
		Integer i4 = 10;
		
		int i5 = i4;
		
		System.out.println(i4 + ":" + i5);
		
		
		
		
		
	}

}

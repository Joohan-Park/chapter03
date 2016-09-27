package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point();
		
		System.out.println((p.getClass().getName()));
		System.out.println(p.hashCode());//레퍼런스 밸류 x , 주소도 아니고, 단지 객체의 주소를  기반으로 만든 해싱값
		System.out.println(System.identityHashCode(p));
		System.out.println(p.toString());
		System.out.println(p);
		
		System.out.println();

	}

}

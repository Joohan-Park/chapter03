package chapter03;

public class StringTest4 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.replace("a", "R"));
		System.out.println(s);
		System.out.println(s.replaceAll("abc", "123"));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		
		String a="abdc";
		String b =",efg";
		
		String c = a.concat(b);
		System.out.println(c);
		
		String[] arr = {"hello","World","java"};
		String str = "";
		for(String str2: arr){
			str= str+str2;
		}
		
//		String str2 = "hello"+"World"+"java";
//		StringBuffer sb = new StringBuffer("hello");
//		sb.append("Wolrd");
//		sb.append("java");
		
		String str2= new StringBuffer("Hello").append("World").append("java").toString();
		
		System.out.println(str2);
		
	}

}

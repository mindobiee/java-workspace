package day03;

import java.util.Date;

public class Test01_equals {
	public static void main(String[] args) {
		System.out.println(7==8);
		System.out.println("ABC".equals("ABC")); // 참조형
		System.out.println("java".equals("sql")); // 앞 뒤 순서 중요 x
		System.out.println("sql".equals("java"));
		System.out.println("Hello".equalsIgnoreCase("HELLO")); //대소문자 구분 x 비교.
	
		String s1="";
		String s2="";
		System.out.println(s1.equals(s2));
		
		int num=99;
		Date d1= new Date();
		String msg1 = new String("~~~~");
		String msg2 = "java";
		new String("java");
		d1=null;
		msg2=msg1;
		
		
	}

}

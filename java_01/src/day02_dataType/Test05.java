package day02_dataType;

public class Test05 {

	public static void main(String[] args) {
		// 기본형 비교 : == , 참조형 비교 : equals(), 
		int x=99, y=99;
		System.out.printf("%d == %d ? %b %n", x,y, x==y);
		
		String s1=new String("ABC");
		String s2=new String("ABC");
		System.out.printf("%s equals %s ? %b %n", s1,s2, s1.equals(s2));//true
		// s1==s2 : 서로의 주소를 비교하게됨 //false
		// s1.equals(s2) : 각자가 가리키는 값을 비교하기
		
		String a="java";
		String b="java";
		System.out.printf("%s equals %s ? %b %n", a,b, a.equals(b));//true
		System.out.printf("%s == %s ? %b %n", a,b, a==b);//true
		/*
		 *  메모리
		 *  스택/힙/코드표 영역(static) 
			지역변수/new keyword-->gc가 관리함./new 안해도 올라감.
			
			"java" --> code 표 영역에 들어 있어서 같은 문자열을 reuse해서 쓴다. 
			
			a,b가 같은 주소의 같은 문자열을 가리킨다. 
			"="을 쓰거나 "new"를 쓴 것 다른 메모리이다!
			
			String은 하나의 자원을 공유하기 때문에 --> 메모리 안에 있는 데이터를 절대 바꿀 수 없음.
			(remutable 객체)
			*
			*/
	}

}




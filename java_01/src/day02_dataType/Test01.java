package day02_dataType;
import java.util.Date; // import 구문을 통해 full name 생략 가능
// 어떤 패키지인지 모를 때 코드 힌트를 받을 수 있음. 

public class Test01 {
	// 변수(멤버 변수) + 기능(method 함수)
	
	// global 변수
	int num;
	String name;
	
	public static void main(String[] args) {
		// 변수, 지역변수, 초기화를 해야 사용 가능
		
		// 기본형
		int num; 	// 변수 선언
		num=0; 		// 초기화 (정수만 가능, null x)
		System.out.println(num); 
		
		// 참조형
		String name;
		name=null; // 주소가 아직 할당 x (가리키는 곳 없음)
		System.out.println(name);
		
		// string은 참조형이지만 기본형처럼 세미 타입으로 사용한다. 
		String name1;
		String name2=null;
		
		name1 = new String("홍길동"); // x heap
		name2 = "고길동"; 				// 0 코드표 영역 - 이게 편하니까
		// 올라가는 메모리 영역이 달라짐.
		
		System.out.println(name1); 
		System.out.println(name2); 
		
		name1= null; // 다 썼으면 반드시 null assign을 해준다.
		
		// 참조형
		Date now = new Date(); // 패키지명 명시해줘야함. 
		java.lang.String str; // java.lang 만 생략 가능함. 
		
		System.out.println(now);// Tue Dec 22 10:49:38 KST 2020
		
		java.sql.Date now2 = new java.sql.Date(System.currentTimeMillis());
		// date를 생성하는 방법이 class에 따라 다름.
		// 같은 class를 사용하려면 package를 동시에 import 불가
		
		System.out.println(now2); 
		//Date -> Calendar -> Local Date 
		// 2020-12-22
		
	}
}

package day05;

import java.util.Calendar;

public class Test05 {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		System.out.println(s1);
//		Singleton s2=new Singleton();
//		Singleton s3=new Singleton();
//		Singleton s4=new Singleton();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		Singleton s4=Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		// 주소가 다름. (heap에 계속 뜨게 됨) 
//		day05.Singleton@7852e922
//		day05.Singleton@4e25154f
//		day05.Singleton@70dea4e
//		day05.Singleton@5c647e05
		
		/* Singleton으로 바꿔준 후
		day05.Singleton@7852e922
		day05.Singleton@7852e922
		day05.Singleton@7852e922
		day05.Singleton@7852e922
		*/
		System.out.println("----------------------");
//		Calendar cal = new Calendar();
		// abstract : 객체 생성 불가능한 클래스!
		// 생성자 함수가 아니라 다른 방법으로 생성하는 메소드 !
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);// 날짜 관련 정보 0
		
		// 메소드 오버로딩 
		new String();
		new String("ABC");
		new String("ABCDEFG".toCharArray());
		new String("ABCDEFG".toCharArray(),2,5);
		
		// 오늘 총 정리 
		// 클래스 디자인 (모델링하는 방법)
		// 데이터와 기능 (private)-> setter &getter
		// 기능 : 선언부 만들고, 리턴타입 고민
		// 똑같은 이름의 메소드 여러 개 존재 : 메소드 오버로딩
		// instance와 static (<- share 개념이 크면 static으로)
		// 생성자 함수 여러개 있을 수 있다. 
		// 메소드 잘 만들 수 있어야 한다. 
		// 내일 상속 들어감. (예습하기) 오버라이딩
	}

}
class Singleton{//하나로 공유해서 쓰자!
	static Singleton s = new Singleton();
	
	private Singleton(){}
	// private 설정 : 외부에서 객체 생성 불가 
	
	public static Singleton getInstance() {
		// static 영역에서는 this와 super 키워드 쓸 수 없다!
		return s;
	}
	// 이 메소드를 외부에서 객체 생성하지 않고 사용하려면? 
}

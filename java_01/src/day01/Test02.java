package day01;

class Test02 { // 자바 이름을 줄 때 : 낙타 표기법 : 중간에 대문자
	//이름 규칙 꼭 지키기 ex) TestSample
	// 클래스의 구성 요소 = 데이터 (변수)+ 기능(메소드)
	// 실행 가능한 기능 ? -> main 함수 
	// (함수 밖) : 글로벌 변수
	
	public static void main(String[] args) {
		// 명령문 기술
		// (함수 내) : 로컬 변수
		// 자바의 기본적인 데이터 타입 소개 
		System.out.print(30+"\t"); // 정수, 줄바꿈 x, 탭 간격 유지
		System.out.print(30.6+55+"\n"); // 실수+정수 =실수, newline 명시 
		System.out.println(30.6); // 실수
		System.out.println(1/2); //정수/정수=정수 -> 0.5 는 잘림 
		System.out.println(true); // boolean
		System.out.println("홍길동"); // string
		System.out.println("A"); // char 타입
	}
}

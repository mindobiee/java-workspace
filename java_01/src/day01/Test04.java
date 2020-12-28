package day01;

//자바의 데이터 설명 (기본형, 참조형) 
public class Test04 {
	// 데이터 (변수) + 기능 (함수)
	public static void main(String[] args) {
		// 변수 : 담기 위한 기억 공간!-> 데이터 타입이 필요하다. 
		// 기본형 
		byte num1 =99; // 데이터 타입을 기술해 주어야 한다. 
		// 정수만 들어감.
		byte num2 = 127; // -2^7 ~2^7-1 (범위를 벗어나면 에러) 
		// 메모리 절약을 위해서 (연산 작업이 없다면) byte 타입을 쓰면 좋음. 
		// 연산작업이 있으면,  int로 형변환이 이뤄짐. 
		// byte : i/o 작업을 할 때
		long num3=99999999999l; //int -> long ? 에러?
		// 이미 int 타입 -> l을 마킹해서 구분해야 함. 
		long num4=999999999;
		// 숫자가 작으면 문제가 발생하지 않는다. (자동으로 형변환이 일어남) = promotion
		int num5=(int) 99999999999l; // 작은 데이터타입에 넣었을 때 자동으로 변환 x : 명시적 형변환이 필요함.
		System.out.println(num5);  //1215752191 데이터 손실 일어남. 
		
		double num6=99.9; // 실수 기본 형이 double이기 때문에 ok
		float num7=99.9f; // f를 붙여주어야 함. 
		// 부동소수점이기 때문에  차이 0 , 메모리 아끼려고 float x
		System.out.printf("%d %n", num5);
		System.out.printf("%.2f %n", num7); // 소수 2개 자리까지!!
		
		char ch ='A'; // 문자 기록 (내부적으로 아스키 코드를 가지고 있음) 
		// 내부적으로 65라는 값을 가지고 있다.
		System.out.printf("%c, %c %n", ch, ++ch);
		// 문자이지만, 정수 연산 가능함. 
		boolean flag = 10 == 9; // false
		System.out.printf("%b %n", flag); // 모든 데이터 타입은 스트링으로 변환 가능 (%s 사용 ok)
		
		int a =65, b=66;
		flag = a>b;
		System.out.printf("%d > %d => %s %n",a,b, flag); // 모든 데이터 타입은 스트링으로 변환 가능 (%s 사용 ok)
		
		// 문자열 (기본으로 처리x) --> 참조형 
		String name="홍길동";
		System.out.println(name.charAt(0)); // "홍"
		// 주소가 들어가는 것 : dot 연산자 쓸 수 있음. 
		
		
		//num2 99.9;
		//'A';
		//10>9;
		//"홍길동";
		
		
	}

}

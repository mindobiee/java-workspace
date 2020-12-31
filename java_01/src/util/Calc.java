package util;

public class Calc {
	
	int num;
	static int pi=3; // static한 자원 만들기
 	//static 영역에서는, this 사용 x
	
	// 기능 :  + - * / (만 있는 계산기 클래스 만들기)
	// 두 수를 더하는 add 함수
	public static int add(int a, int b) { // static 키워드 쓰기 
		// 문제 없이 동작하나 사용하는 방법이 다름. 
		return a+b; //+num->에러
	}
	
	//new (매개변수의 갯수 만큼 더하기)
	public static int add(char c, int ... a) {
		int sum=0;
		for (int data:a)
			sum+=data;
		return sum;
	}
	
	//이름은 같지만, 매개변수와 리턴값 타입이 다른 오버로딩
	public static double add(int a, double b) { 
		return a+b; 
	}
	public static double add(double a, double b) { 
		return a+b; 
	}
	//메소드 이름은 하나이지만..!
	
	public static int minus(int a, int b) {
		if (a>b)
			return a-b;
		else
			return b-a;
	}
	public static int multi(int a,int b) { 
		// 선언부 (정수 2개 필요, 수행이 완료되면 결과값으로 int!, 누구나 호출 가능함.) 
		return a*b;
	}
	public static int div(int a, int b) {
		if (b!=0) return a/b;
		else return -1; // 함수는 반드시 리턴문이 있어야 함. 
	}
	
	
	

}

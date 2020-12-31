package day05;

import util.Calc;

public class Test02_usingCalc {

	public static void main(String[] args) {
//		Calc c1 = new Calc(); 
//		int a = c1.add(1111,456); //인수 내용이 식이여도 그 결과가 정수이면 ok !
//		int b = c1.minus(1111,456);
//		int c = c1.multi(1111,456);
//		int d = c1.div(1111,456);
		
//	  	System.out.printf("덧셈:%d, 뺄셈:%d, 곱셈:%d, 나눗셈:%d",a,b,c,d);
		
		// static 처리 후 클래스를 통하여 바로 메소드를 사용 가능함. 
		int res=Calc.multi(1,2);
		int res2=Calc.multi(2+2+2, Calc.add(9, 9));
		
		
		//디버깅 모드 : c1 -> 문자가 들어 있다. (day05.Calc@6108b2d7)
		
		//after lunch
		System.out.println(Calc.add(5, 5));
		System.out.println(Calc.add(5,5.4));
		System.out.println(Calc.add(5.5,4.5));
		System.out.println(Calc.add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(Calc.add(1));
	}

}
// 인스턴스 자원과 static 자원의 분리
// stack영역
// heap영역 : new, this
// static: "this" (x) 에러 떨어짐
// static -> print() : 에러 나타남. 






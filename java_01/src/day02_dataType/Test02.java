package day02_dataType;

import java.util.Date;

public class Test02 {

	public static void main(String[] args) { // 런타임에 받아오는 데이터 (파라미터)
		
		Date d = new Date();
		System.out.println(d.toLocaleString());
		Date d2= d; // 이 주소를 참조함. 
		d=null;
		if (d!=null)
			System.out.println(d.toLocaleString());
		// 더이상 쓰면 안됨. => NUll exception error (d2.은 사용 가능함) 
		// d2가 참조하고 있으므로, Garbage Collector 사용 x
		
		String msg = d2.toLocaleString(); // 메소드 호출 -> 문자열 반환 -> 바로 저장 가능함.
		System.out.println(msg);
		
		new Date(); // 사용하지 않ㅇ면, 나중에 자동으로 가비지 처리가 됨. (임시 객체 : 자동으로 gc의 대상이 된다.)
		
		double pi= Math.PI; // Math class의 Pi 메소드 사용 가능함.
		System.out.println(pi);
		
		double r = Math.round(pi); // 반올림 
		System.out.println(r);
		
		char ch ='A'; // 65
		int c1 = 65;
		
		System.out.printf("%c %d %n", ch, c1); // A 65 
		System.out.printf("%d %c %n", (int)ch, (char)c1); // 65 A 
		
		System.out.println("END"); // 정상종료 판단
		return; // 생략되어 있다. (void 이기 때문에 아무것도 없는 것)
		
	}
	/*result
	 * 2020. 12. 22 오전 11:25:40
		END
	 * */

}

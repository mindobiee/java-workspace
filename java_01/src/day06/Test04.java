package day06;

public class Test04 {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("고양이");
		Animal a2 = new Animal("고양이");
		System.out.println(a1.toString()); // 주소가 들어 있다.(object로 물려받은 메소드 오버라이딩 후) 
		// Animal 결과 : [kind=고양이] -
		// toString과 equals 메소드를 사용할 때는 반드시 오버라이딩 한다. 
		// how to? : source -> generate hashCode() & equals()
		System.out.println(a2);
		System.out.println(a1.equals(a2));// false
		
		String s1 = new String("홍길동");
		String s2 = new String("홍길동");
		System.out.println(s1); //주소가 들어 있다. (데이터의 출력)
		System.out.println(s1.toString());// toString()자동 호출 
		//object 로 물려받은 오버라이딩
		System.out.println(s2);
		System.out.println(s1.equals(s2)); // true
		// collection set 구조 !! (중복 허용 x)  -> 중복 체크 
	}

}

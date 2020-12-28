package day03;

public class Test07 {

	public static void main(String[] args) {
		String msg = "hello"+","+"java"+","+"Spring"; // 성능 x
		/* 내부적으로 : 코드표 & 메시지 변수가 있다. 
		 hello 문자열이 만들어짐 -> immutable하기 때문에
		"hello", "hello,", "hello,java"... 이렇게 쓸데없임 문자를 계속 생성한다.
		*/ 
		System.out.println(msg);
		// String Builder (heap영역)(=StringBuffer)
		
		// 성능이 훨씬 좋음.
		StringBuilder sb= new StringBuilder(); // 1. 객체 생성
		sb.append("hello");
		sb.append(",");
		sb.append(1); // 정수 타입도 가능(모든 타입 append!)
		sb.append(", java, ");
		sb.append("Spring");
		// String을 빌딩은 하지만 String은 아니다!
		
		String result=sb.toString();// String으로 컨버팅되는 방법!
		System.out.println(result);
	}

}

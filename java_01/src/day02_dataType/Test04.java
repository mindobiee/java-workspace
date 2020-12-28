package day02_dataType;

public class Test04 {

	public static void main(String[] args) {
		// 산술 연산자, 비교 연산자, 논리 연산, 비트 연산자, 조건 삼항 연산자
		// 두 변수가 정수일 경우
		int x = 100, y = 7;
		System.out.println(x / y);// 몫
		System.out.println(x % y);// 나머지

		int num = 100;
		System.out.println(num++);
		System.out.println(++num);

		// 비교 연산자 : instanceof, equals() 같이 연결!!
		String msg = null;
		msg = "Hello Java"; // 동적 바인딩

		int idx = 11; // index 범위
		// 조건 => String 배열의 범위를 정해줄 것 0<=idx<=msg.length()

		// 문자의 배열을 관리
		if (msg != null && (idx >= 0 && idx < msg.length())) {
			System.out.println(msg.toUpperCase().charAt(idx)); // 문자 배열의 인덱스를 가리킴.
		} else {
			System.out.println("msg is null or idx is not appropriate.");
		}
		/*
		 * 1)null이면 주소가 없는 것을 사용 } java.lang.NullPointerException 예외 처리 2)인덱스 범위를 벗어날 경우
		 * java.lang.StringIndexOutOfBoundsException
		 */
		// 알고리즘 가지치기 (불필요한것 돌지 않게 하는 것)!! 조건을 잘 만드는것이 중요함.
		// 비교 연산자 두 개짜리가 성능이 더 좋다. ( &&, ||)
		// 비트 연산자, 논리 연산자 + shift 연산자
		System.out.println(4 << 2);// 16
		System.out.println(4 >> 1);// 2
		System.out.println(4 & 1);// 0
		System.out.println(4 | 1);// 5
		// 알고리즘 문제 풀 때 쓰게 되는 비트 연산자

		// 조건 삼항 연산자
		int jumsu = 60;
		// 80점 이상이면 pass, 이하이면 no pass (믿을만한 데이터인지 확인한다)
		if (jumsu >= 0 && jumsu <= 100) {
			// 유효성 check를 해주기 !!
			String res = jumsu > 70 ? "합격" : "재시험"; // 앞뒤 타입이 일치할 수 있게 !
			System.out.printf("취득 점수 %d, 합격 여부 :%s %n", jumsu, res);
		}
		System.out.println("End");
		return;
	}
}

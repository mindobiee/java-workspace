package day01;

public class Test03 {
	
	public static void main(String[] args) {
		System.out.println(3+4+"홍길동"+"\t"+'A'+"\t"+true+"\t"+300);
		
		// 성능저하의 원인이 되는 코드 ! 
		// string 연결 => concat 연산자 있었음.
		// 정수 + 스트링 (string으로 문자열 타입 바뀜) + 문자열 머지시킴 
		// 문자열도 클래스, 메모리 힙에 compact 연산을 함. 
		// 내부적으로 string을 converting ... 다시 타입을 변환, 변환, ...
		//"+" 연산이 string끼리 concat 연산을 한 것 => 메모리 소모가 많다.
		// string 끼리 +연산 : 안좋음. => 시간 내에 못풀어요. 
		
		//성능이 개선된 코드가 완성됨.
		
		System.out.printf("%d \t %s  \t %c \t %b \t %d %n"
				+ "", 3+4, "홍길동", 'A',true,300);
		
	}

}

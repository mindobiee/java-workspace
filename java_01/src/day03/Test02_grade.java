package day03;

import java.util.Scanner;
// import java.util.*; // 절대 안씀. -> memory에 있는 모든 패키지가 static에 다 올라가서 문제가 생긴다.

public class Test02_grade {
	
	public static void main(String[] args) {
		System.out.println("성적처리 App start");
		
		//local -> 초기화해야지 메모리에 들어간다. 
		String name = null;
		int kor=0;
		int math=0;
		// java.io -> 알아야 할게 많음. 
		// java.util -> 키보드로부터 편하게 입력 (jdk1.5부터)
		
		Scanner scanner = new Scanner(System.in);
		// 키보드,  file로부터 입력받는 것. 
		System.out.println("계속 진행하고 싶으면, yes를 입력하세요. 그렇지 않으면 no를 입력하세요.");
		String msg = scanner.nextLine();
		
		// 평균 -> 등급
		// 흐름을 바꾸는 것 : 제어문 
		if(!msg.equalsIgnoreCase("Yes")) { // 대소문자 구분 x
			
			// close라는 함수가 있다. (객체가 사용한 자원들을 반납) 
			// 주소가 필요
			// 특히 * JDBC 연동 -> 자원반납 굉장히 중요하다. or 서버 죽음.!!!
			// scanner 여러 개 쓸 수 있음.
			if (scanner!=null) scanner.close(); // 반납 후 멈춤.
			scanner = null; //키보드도 자원이기 때문에 :) --> 이걸로는 반납 x 
			System.out.println("종료합니다.");
			// 발생할 수 있는 예외? null point exception!
			// 파일이 없거나, 키보드 잭에 빠져 있는 경우
			
			return; // 멈춰버림 (app이)-> 함수 무조건 종료함. 
		}
		// 스레드가 대략 60% -> 가비지 콜렉터 동작함.
		// gc가 동작할 경우에 서비스가 힘들어짐. (보통은 밤에 함) 
		System.out.println("학생의 이름을 입력하세요");
		name=scanner.nextLine();
		System.out.println("국어 점수를 입력하세요");
		kor=Integer.parseInt(scanner.nextLine());
		System.out.println("수학 점수를 입력하세요");
		math=scanner.nextInt();
		// 한줄에 100개의 데이터도 읽어들일 수 있다!
		
		scanner.nextLine();// 엔터 때문에 문제 x 
		
		System.out.printf("이름 =%s, 국어점수=%d, 수학점수=%d",name,kor,math);
		double avg=(kor+math)/2.;
		String error= avg>=0&&avg<=100?"":"점수 확인 필요";
		
		// 중첩 if문, switch문 이용해서 등급 매기기!! 
		char grade=' '; // 무슨 에러?? // 맨 뒤에 인터키가 남아 있어서 없애주어야함.
		// 파일 -> 줄들 간의 엔터가 넘어온다. 
		// ""(ok), ''(x), 
		
		if(avg>=90 && avg<=100) {
			grade='A';
		}else if(avg>=80 && avg<90) {
			grade='B';
		}else if(avg>=70 && avg<80) {
			grade='C';
		}else if(avg>=60 && avg<70) {
			grade='D';
		}else if(avg>=0 && avg<60){
			grade='F';
		}
		// 과제 : 삼항연산자로 변환 해보기
		
		
		String test0 ="0"; //Byte, Short, int, Char, 가능
							//Jdk 1.8 : String : ok
		
		/*
		 * char test = '*'; // +, -, * , / switch( test ) { // int 타입으로 promotion이 가능한!
		 * case '+': System.out.println('+'); break; case '-': System.out.println('-');
		 * break; case '*': System.out.println('*'); break; case '/':
		 * System.out.println('/'); break; default: System.out.println("입력오류");
		 * 
		 * }
		 */
		char gradeS=' ';
		switch((int)avg/10) { // 실수가 안되는 이유: 가질 수 있는 범위가 무한대!
			// 0~100 --> 분기를 줄이기 위한 sample !
			// 0~10
			case 10:
			case 9:
				gradeS='A';
				break;
			case 8:
				gradeS='B';
				break;
			case 7: 
				gradeS='C';
				break;
			case 6:
				gradeS='D';
				break;
			default:
				gradeS='F';
			// 몫을 이용하기!!
		}
		
		System.out.printf("평균=%.2f, 등급=%c", avg, gradeS );
		System.out.println(error);
		System.out.println("성적처리 App end");
		if (scanner!=null) scanner.close();
		scanner = null; // 자원반납된 것 x (g.c의 대상일 뿐이다.) 
		return; // 모든 함수는 리턴문 -> 종료
		// 모든 application -> 자원반납이라는 과정을 거쳐야 한다!
		
	}

}

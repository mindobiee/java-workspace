package day02_dataType;

public class Test03 {

	public static void main(String[] args) {
		System.out.println(Math.random()); // 0<=n<=1인 random method
		// java.lang.패키지 에 있는 자원은 static이기 때문에 new 할 필요 x 
		int num = (int)(Math.random()*100); 
		//소수점 이하 살리는 방법 + double 타입이므로 casting 필요함.
		
		// Wrapper Class를 통한 숫자 파싱 _)
		System.out.println(Double.parseDouble("99")+99.99);
		
		// 형변환 :)
		int num1=Integer.parseInt("99"); // 문자열 형태의 숫자 -> int 형에 넣기 
		double num2=Double.parseDouble("99.99");
		
		System.out.printf("byte, %d ~ %d %n",Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("int, %d ~ %d %n",Integer.MIN_VALUE, Integer.MAX_VALUE);
		//byte, -128 ~127 
		//int, -2147483648 ~2147483647 
		
		/*
		Integer
		Character
		Byte
		Double 
		Float
		==> Wrapper Class
		*/
		
		char ch='A'; // ch>='0' && ch<='9'
		
		System.out.println((int)'A'); 
		// 대문자 아스키 코드 : 65<=n<=90
		// 소문자 : 97<=n<=122
		
		// 대소문자 변환 알고리즘
		// 대문자 변환 알고리즘 [대문자]-32=[소문자] 
		System.out.printf("%c 숫자니? %b %n", ch, ch>='0' && ch<='9'); // 숫자인지 판별함
		System.out.printf("%c 숫자니? %b %n", ch, Character.isDigit(ch)); // 메소드로 이용 가능
		
		// 알고리즘 정렬 => selection sort ? 데이터가 적을 때는 문제 x, 
		// 다른 정렬로 바꾼다. (알고리즘 --> 성능하고 직결된다) 
		
		int x=9, y=11;
		System.out.printf("(x=%d, y= %d) %n", x,y);
		//swapping code
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.printf("(x=%d, y= %d) %n", x,y);
		
		// String API w/t temporary 객체 
		System.out.println(" hello 	java	".length()); 
		System.out.println(" hello java	".trim());// "hello java" -> String
		System.out.println(" hello java	".trim().length()); // method 체인   -> int
		System.out.println(" hello java	".trim().charAt(4)); // 몇 번째 문자열! -> char
		System.out.println(" hello java	".trim().toUpperCase()); // "HELLO JAVA"
			
	}
}

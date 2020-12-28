package Labs;

import java.util.Scanner;

public class day03_1 {

	public static void main(String[] args) {
		/*
		 * [1] int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고  
    		100 나눠떨어지지 않을 때 인 조건식을 만들어 보세요(윤년공식).
		 * */
		int year;
		System.out.println("year를 입력하세요.");
		
		Scanner scan= new Scanner(System.in);
		year=scan.nextInt();
		if (year%400==0 || year%4==0 && year%100!=0)
			System.out.printf("%d 년은 윤년입니다. %n", year);
		else
			System.out.printf("%d 년은 윤년이 아닙니다. %n", year);
	}

}

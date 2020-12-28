package day03;

import java.util.Scanner;

public class Test03_switch {

	public static void main(String[] args) {
		String floor="";
		String msg="";
		System.out.println("원하는 층을 눌러주세요.(1~4층)");
		Scanner scan = new Scanner(System.in);
		floor = scan.nextLine();
		switch(floor.trim()) { //문자 중에 원하는 것만 뽑아내기.
		case "1":
			msg="약국입니다.";
			break;
		case "2":
			msg="피부과입니다.";
			break;
		case "3":
			msg="내과입니다.";
			break;
		case "4":
			msg="스포츠센터입니다.";
			break;
		default:
			
		}
		System.out.printf("%s층은 %s",floor, msg);
	}

}

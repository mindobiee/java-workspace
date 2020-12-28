package day04;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// 배열 선언, 생성, 초기화  -> 1 line 
		int[] num1 = new int[5]; // 디버깅 모드에서 찬찬히 볼 것.
		int[] num = {1,2,3,4,5,6};
		// reference.... 되어버림.
		System.out.println(Arrays.toString(num));
		// boolean 의 배열 많이 사용한다 .
		String[] names1 = new String[5];
		String[] names = new String[] {"김민경","김지훈","수미","은비"};
		System.out.println(Arrays.toString(names)); // 주소가 들어갈 공간이다. 
		// 구조 두 개를 명확히 인식하고 있을 것
		
		// 검색
		// 선형 탐색 --> 시간 더 줄이는 방법? => 알고리즘!(예) 이진검색
		
		
		// num 배열에서 50번 찾기 -> 기본형
		for(int i=0;i<num.length;i++) {
			if(num[i]==5){
				System.out.println(i);
				break;
			}
		}
		// names 배열에서 "김민경" 찾기-> 참조형 (dot 사용가능)
		for(int i=0;i<names.length;i++) {
			if(names[i].contentEquals("김민경"))
				System.out.println(i);
			if(names[i].length()==2)// ex) 이름이 두 글자인 사람만 출력하기 
				System.out.println(names[i]+", ");
		}
		System.out.println("------------------------------------");
		for(String data:names) {
			System.out.printf("%s, %c** %n", data,data.charAt(0));
		}
		System.out.println("------------------------------------");
		
		// 각기 다른 타입별 array
		char[] ch = new char[26];
		boolean[] flag= new boolean[5];
		
		// String : 문자의 배열을 관리하는 것!
		char[] ch1 = "hello java~~~".toCharArray(); // String -> char의 array 로 문자가 들어가게된다.
		for(char c :ch1)
			System.out.printf("%c|",c);

	}

}

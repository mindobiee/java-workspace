package day04;

import java.util.Arrays;

public class Test05_args {

	public static void main(String[] args) { // arguments : 실행 파라미터이다. 
		System.out.println(args.length);
		//조건 : 잘 만들어내기  
		if(args.length > 0 && args[0].length()>0) // 코테 : 예외사항 체크했는지 확인할 것 (해당 문자열이 있는지)
			System.out.println(args[0].charAt(0)+"**");
	
		int[] num= new int[Integer.parseInt(args[0])];
		System.out.println(Arrays.toString(num));
	}
}
// 일차원 배열 
// linked list : 띄엄띄엄 있어서 접근하는 속도는 느림. 
// int, string의 배열 : primitive, reference 
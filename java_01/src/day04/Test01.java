package day04;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// 1.array 선언 (주소) 2.array 생성  3.array 초기화
		
		int[] jumsu = null; // Reference 변수, 초기화 : null로
		// 점수의 변수에 100명의 변수를 집어넣어야 한다! 
		
		jumsu = new int[5]; // 2. array 생성 (int 타입 100개를 만드세요.)
		
		// heap 영역에 (new를 해서) 들어가게 됨.
		// int 타입 : 4byte -> 연속적으로 100개의 공간이 만들어진다.
		// 인덱스 (0부터) 붙게 된다. 
		// default 초기화 0으로 이루어진다.
		jumsu[0]=99;
		jumsu[1]=100;
		jumsu[2]=89;
		jumsu[3]=89;
		
		// 이렇게 초기화 작업 가능 (데이터 값 집어넣을 수 있다.)
		int sum=0;
		for(int i=0;i<jumsu.length;i++) { // 배열 -> for loop (원소 한 개씩 접근)
			sum+=jumsu[i];
			System.out.print(jumsu[i]+ " ");
//			System.out.println(Arrays.toString(jumsu)); // 클래스 이름으로 접근 (유틸 메소드 참고) 
		}
		System.out.println();
		System.out.println(sum/jumsu.length);//평균
		
		System.out.println("===새로 나온 for loop (type varname: collections)====");
		for(int data:jumsu){ 
			System.out.println(data);
		}
		System.out.println("======================================");
		int[] num = new int[10]; // 힙영역에 int 타입으로 100개 만들어짐.
		System.out.println(Arrays.toString(num)); // 100개의 배열 + 디폴트 0으로까지!
		
		//1. 전통적인 for loop
		for(int i=0;i<num.length;i++) {
			num[i]=(int)(Math.random()*100); // 0~99 사이의 랜덤값
		}
		sum=0;
		//2.
		for(int data:num) {
			sum+=data;
			System.out.printf("%d, ", data);
		}
		System.out.println(sum);
	}
}

package day03;

import javax.swing.JOptionPane;

public class Test04_for {

	public static void main(String[] args) {
		/*
		 * 반복횟수 - for loop
		 * 반복횟수 모름 - while loop,  
		 * do while - 최소 한 번 수행하고 싶을 때
		 */		
		int num=99;
		for(int i=0; i<10; i=i+2) { // 조건이 있어야지 무한루프 x
			System.out.println("hello java"+i);
		}// i : block scope 에서만 사용.
		
		int i=-99; // 다시 선언해주는 것 가능. 
		System.out.println(i);
		
		//감소시키는 for문
		for(int count=9;count>5;count--) {
			System.out.println("html 5");
		}
		//조건에 만족하지 않으면 실행 자체 x
		for(int count=9;count>10;count--) {
			System.out.println("html 5");
		}
		for(int count=0;;count++) { // 무한루프에 빠짐.
			System.out.println("~~~~");
			if (count==4)break;
			//조건 부여 : 빠져나오기!
		i=0;
		while(i<5) {
			System.out.println("while loop"+i);
			i++;
		}
		String msg="";
		boolean flag=false;
		while(!flag) {
			System.out.println("~~~~");
			msg=JOptionPane.showInputDialog("종료를 원하면 Quit");
			System.out.println(msg);
			if (msg.equalsIgnoreCase("quit"));
				flag=!flag;
		}
		
		i=9;
		do{
			System.out.println("do while loop"+i);
			i++;
		}while(i<5);
		}
	}
}
		
		



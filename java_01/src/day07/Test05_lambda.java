package day07;

import javax.swing.JOptionPane;

public class Test05_lambda { 
	// JDK 1.7 이후부터 함수형 lambda가 지원이 된다. 
	// abstract method -> interface -> @FunctionalInterface -> lambda! 
	
	public static void main(String[] args) {
		Command delete = ()->{
			System.out.println("delete...");
		}; //arrow 함수(화살표 함수)이다. 
	
		Command insert = ()-> System.out.println("insert...");	
		// 한줄이라서 {}가 필요 x
		
		Command update = ()-> System.out.println("update...");
		
		String msg = JOptionPane.showInputDialog("1.Delete 2. Insert 3. Update");
		switch(msg) {
			case "1":
				delete.exec();
				break;
			case "2":
				insert.exec();
				break;
			case "3":
				update.exec();
				break;
			default:
				System.out.println("다시 입력하세요.");
		}
		
	}
}
// 자바스크립트 => 변수에 함수를 넣음. 
// 리액트, 뷰.js 브라우저 단에서 대세 
// 자바 -> 객체 지향형 : 주소 없이 호출하는 것이 불가능하다! (자바의 한계) ㅋㅋㅋ
// 함수 기반형 (자바스크립트, 파이썬)과 달리 !


//@FunctionalInterface //람다표현으로 갈 수 있다. (abstract method가 여러개면 안됨) 
//interface Command{
//	void exec();
//	default public void base() { 
//		System.out.println("~~base~~~~");
//	} 
//}
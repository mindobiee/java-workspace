package day07;

import javax.swing.JOptionPane;

public class Test04_anonymous {

	public static void main(String[] args) {
		Command delete = new Command(){ //이름 없는 이너클래스 (익명) 
			@Override
			public void exec() {
				System.out.println("delete...");
			}
		}; 
		Command insert = new Command() {
			public void exec() {
				System.out.println("insert...");	
			}
		};
		Command update = new Command() {
			public void exec() {
				System.out.println("update...");
			}
		};
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
//
//interface Command{ // 인터페이스 
//	void exec();
//	default public void base() { 
//		System.out.println("~~~");
//	} 
//}
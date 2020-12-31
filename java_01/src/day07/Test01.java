package day07;

import day05.Employee;

public class Test01 {

	public static void main(String[] args) {
		new Employee();//상속 안된 상태 -> protected 안보임
		// public -> 어디서든지 사용 가능 
	}

}

class SalesEmployee extends Employee{
	
	SalesEmployee(){
		name="홍길동";
	}
	
	public void print() {
		System.out.println(this.name);//protected 보임
		// private 하면 같은... 
		
	}
}
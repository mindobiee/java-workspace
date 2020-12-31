package day05;


public class Test03_anotherEmp {

	public static void main(String[] args) {
		Employee emp1=new Employee(); //생성자 함수
		emp1.print();
		//new Employee();
		//temporary 객체 생성될 때 생성자 함수 자동 호출됨. 
		
		Employee emp2 = new Employee("홍길동","기술부", 28);
		emp2.print();
		
		Employee emp3 = new Employee("이길동",28);
		emp3.print();	
	}
}

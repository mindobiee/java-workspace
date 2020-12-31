package day05;

import day04.Employee;

public class Test01_usingEmp {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.setName("홍민지");
		emp1.setDept("홍보부");
		emp1.setAge(26); //값이 assign됨. 
		emp1.print();
	
		//캡슐형 (data hidden) 
	
		Employee emp2=null;
		if(emp2!=null)
			System.out.println(emp2.getDept()); 
		
		//인스턴스 자원 -> new: 메모리에 계속 뜨게 된다. (100번 하면 100번 띄워짐.)
		
		
	
	//상속
	//다형성 (오버라이딩) => 서비스 레이어 구축 ok
	}
}

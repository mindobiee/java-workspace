package day04;


public class Employee{ 
	//public을 하려면 파일 분리해야 한다.
	
	//encapsulation
	private String name; 	
	private String dept; 
	private int age;	
	//같은 클래스 영역에서만 접근이 가능함. 
	
	//setter & getter 통해서 변수에 접근 가능
	
	public void setAge(int age){
		if(age>0) // 유효성 check까지 가능!	
			this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge(){
		return age;
	}
	// 무조건 만든다. (source -> generate setter/getter)
	
	//세금계산
	public void print() {
		//정보출력
		System.out.printf("[사원명 :%s|근무부서:%s|나이:%d]%n",name,dept,age);
	}
	
}

package day05;

/*
 * @author minkyoung
 * @since 2020 12
 */

public class Employee{ 
	//public을 하려면 파일 분리해야 한다.
	
	//encapsulation
	protected String name;//상속 받은 클래스에서만 공개!	
	private String dept; 
	private int age;	
	
	//같은 클래스 영역에서만 접근이 가능함. 
	
	//생성자 함수 : 초기화 담당함.
	public Employee() {
	}
	
	//생성자 함수의 메소드 오버로딩
	public Employee(String name, int age) {
		this(name,null,age);//함수 호출을 통해 중복 제거
	} // 주의 : this() 반드시 첫 번째 라인 위치만 허용
	
	public Employee(String name, String dept, int age) {
		this.name=name;
		this.dept=dept;
		this.age=age;
	}
	
	//setter & getter 통해서 변수에 접근 가능
	/*
	 * @ param age 양수만 가능 
	 * */
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
	//클래스 ! (오늘) 
	//상속, 오버라이딩 -> 자바의 꽃!
}

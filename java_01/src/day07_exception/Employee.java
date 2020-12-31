package day07_exception;

public class Employee{ 
	
	protected String name;
	private String dept; 
	private int age;	
	
	public Employee() {
	}
	public Employee(String name, int age) throws Exception {
		this(name,null,age);
	} 
	
	public Employee(String name, String dept, int age) throws Exception { // try-catch 하지 말고 throws Exception을 기입해준다. 
		this.name=name;
		this.dept=dept;
		//try {
		this.setAge(age); // 생성할 때도 음수 나이 예외 발생시킬 것 !
		//}catch(Exception e) {
		//	System.out.println(e.getMessage()); // 클라이언트 단까지 에러 메시지가 가지 않는다 !
		//}
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void setAge(int age) throws NegativeAgeException{ // 예외 발생 가능 !!!!!!!!!!!!
		if(age<0)throw new NegativeAgeException("나이 음수 안됨"); 
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
	
	
}

//클래스 만들어줌. 
class NegativeAgeException extends Exception{
	NegativeAgeException(String msg){
		super(msg);
	}
}
package util;

public class Student extends Person {
	
	private int id;
	public Student() {}
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print(); //부모의 메소드 호출 후 
		System.out.printf("학 번:%d %n", id);
	}

}

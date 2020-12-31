package util;

public class Person {
	private String name;
	private int age;
	
	public Person() {}
	// 부모의 기본 생성자가 있어야 extends한 class에서 에러가 안남. 
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void print() {
		System.out.printf("이 름:%s, 나 이:%s ", name, age);
	}
	
}

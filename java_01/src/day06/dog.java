package day06;

//상속 
public class dog extends Animal{ // 추상클래스 상속하면 -> 부모클래스의 abstract method를 반드시 오버라이드 해야 된다.
	String kind="강아지 종류";
	String name;
	
	public dog() {
		super(); //부모의 기본 생성자 호출하게끔 되어 있다.
	}

	public dog(String kind, String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기 ....");
	}
	public void print() {
		System.out.printf("Dog[%s:%s:%s]%n",super.kind,this.kind,name);
	}
	
	public static void main(String[] args) {
		dog d= new dog("시츄","캐리");
		System.out.println(d.kind);
		System.out.println(d.name);
		d.breath(); // 상속 클래스의 메소드 이용
		d.print();
	}
}

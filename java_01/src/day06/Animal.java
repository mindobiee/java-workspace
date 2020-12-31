package day06;

public abstract class Animal{ //extends Object(생략) {
	// abstract class => 메모리에 올라갈 수 없음. (객체 생성하는것) 
	String kind ="동물의 종류";
	
	public Animal(){} // 기본 생성자 - public : 다른 패키지에서도 사용할 수 있다.
	
	public Animal(String kind){
		this.kind=kind;
	}
	
	@Override
	public int hashCode() { // 이걸 오버라이딩해야지 중복 확인 가능하다..!
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kind == null) ? 0 : kind.hashCode());
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
		Animal other = (Animal) obj;
		if (kind == null) {
			if (other.kind != null)
				return false;
		} else if (!kind.equals(other.kind))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [kind=" + kind + "]";
	}

	public void print() {} // 이것만 있으면, 오버라이딩 가능함. 
	// 일반 메소드 -> 필요하면 하고 선택하면 됨. 
	
	public abstract void breath(); // 추상메소드 (body 부는 없고, 선언부만 0) 
	// 일반적인 class에 올라갈 수 x. (미완성의 코드) -> abstract class와 interface에만 존재 가능함.
	// 상속을 전제로 만들어짐. 
	// abstract <-> final : 상속 받으면 안되, 그냥 쓰라. [정반대의 개념]
	// 오버라이딩에 강제성 가지게 하는 것! 
	
	public static void main(String[] args) {
//		Animal a = new Animal();
//		System.out.println(a.kind);
//		a.breath();
	}
	
}

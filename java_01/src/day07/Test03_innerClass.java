package day07;

public class Test03_innerClass {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B(); // 이너클래스 B는 outer 자원의 주소를 꼭 알아야 한다. 
		b.print();
		
		A.B b1 = new A("찰리").new B(); // outer주소.new~~
		b1.print();
	}
}

// static 키워드 : method와 변수앞에 사용하고, class 앞에 쓰면 에러
// 이너클래스는 static 사용 가능 but, 쓰면 에러!! (힙 자원 사용) 
// outer에 있는 static 을 사용할 때 쓰면 된다. 

class A{//아우터 클래스 
	String name="홍길동";	
	
	A(){}
	A(String name){
		this.name = name;
	}
	
	class B{ // 이너 클래스 (A$B) -> 이름이 없는 익명 클래스도 있다. 
		// 목적 : outer를 마음껏 쓰기 위한 것!
		void print(){
			System.out.println(name);//에러 해결
		}
	}
	// 이름이 있으면 reused (객체 지향) 다시 사용할 수 있지만, 이름이 없으면 reuse 불가 !
	// 람다 : 객체 지향으로 reuse를 버렸다!! 
}
// GUI (컴포넌트 많을 때) , 익명 클래스  -> 이너 클래스 사용


class B2{
	A a = new A(); // A라는 주소 필요! (but, 권장x) 너무 강력한 구조!!!! 그럼 어떻게 바꾸나? 
	
	void print(){
		System.out.println(a.name);
	}
	
//	void print(){
//		System.out.println(name); //에러남
//	}
	
}
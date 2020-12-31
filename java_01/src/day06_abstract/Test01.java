package day06_abstract;

public class Test01 {

	public static void main(String[] args) {
		Service service = new MySqlServiceImpl();
		// clients와 server 간의 communication? by interface 기반!
		// new 를 어떤걸로 바인딩하느냐에 따라 다른 setting으로 동작할 것이다. 
		
		// -> java polymorphism 
		service.insert();
		service.delete();
		service.update();
		
	}
}

// 내일 -> 람다 표현식, 
// collection 들어갈 것 !
// 자료구조를 모르면, JDBC 활용이 어렵다. 
// 예외처리 익히기. 
// 알고리즘 : 문제 분석이 필요함.

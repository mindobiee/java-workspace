package day06;

public class Test02_afterLunch {

	public static void main(String[] args) {
		dog d = new dog();
		Fish f = new Fish();
		d.breath();
		f.breath();
		System.out.println("=======================");
		Animal a = null;
		a=d; // dog로 바인딩
		a.breath();
		a=f; // fish로 바인딩 --> 메모리 하단 부에 있는 메소드의 호출 (오버라이딩 -> 다운캐스팅 없이 하단부에 접근 가능함) 
		a.breath();

		// 메소드 사용
		breathCall(d);//폐로 숨쉬기
		breathCall(f);//아가미로 숨쉬기...
		
	}
	
	// this, super 자원 사용 x -> static ok 
	public static void breathCall(Animal a) { //부모 타입의 타입 핸들링 !
		a.breath(); // 자바 polymorphism (다형성) 어떤 객체가 바인딩 되느냐에 따라 동작 결과가 달라짐. 
	}
//	public void breathCall(Fish a) {//메소드 오버로딩 (이름은 같지만, 타입이 다른 것)
//		a.breath();
//	}
}


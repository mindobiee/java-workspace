package day06;

public class Test01 {

	public static void main(String[] args) {
		// is a 관계 -> 모든 객체의 data type은 부모 타입이 될 수 있다. 
		// 부모타입인 경우 접근 영역이 제한을 받는다. (메모리 하단부 접근x) 
		// 메모리 하단부 접근 하려면 다운 캐스팅 필요 
		
		Animal a = new Animal();
		
		dog d1 = new dog();
		Animal d2 = d1; //부모타입이기 때문에 자식 클래스의 메소드 접근 x
		
//		System.out.println(d1.kind);
//		System.out.println(d2.kind);
		
		dog d=new dog();
		System.out.println(d.kind); // 강아지 종류
		System.out.println(((Animal)d).kind); // 부모고 upcasting 
		
		Animal dd =new dog();
		System.out.println(dd.kind); // 강아지 종류
		System.out.println(((dog)dd).kind); // 부모고 down casting 
		
		Object obj=null;
		Fish f = new Fish();
		a= new Fish();
		a= new dog();
	
		((Fish)a).print();
		a=new dog();
		a.breath();
		
		
	}

}

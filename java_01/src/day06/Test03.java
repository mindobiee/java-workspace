package day06;

public class Test03 {

	public static void main(String[] args) {
		dog[] dogs = {new dog(), new dog("진돗개", "캐리")};
		Fish[] fishs= {new Fish("쿠피"), new Fish()};
		
		Animal[] animals = {
				new dog(), 
				new dog("진돗개", "캐리"),
				new Fish("쿠피"), 
				new Fish()
		};
		for(Animal a : animals) {
//			if(a instanceof dog) { // 객체의 데이터 타입 checking 연산자 				
//				((dog)a).print(); 
//			}// 메모리 하단 부에 있다. -> 다운캐스팅 필요함.
//			if(a instanceof Fish)
//				((Fish)a).print();
		
			//dog d = (dog)a; // downcasting 문장 많이 볼 것. 
			// down casting 하지 않고, print 출력하기! 
			a.print(); // animal 에서 무의미한 print()를 만들어주어 overriding을 할 수 있게 만들어준다! 
			a.breath();
		}
	}

}

package day06_abstract;

public interface Service { // 미완성 (객체 생성 불가) 
	void delete(); //파라미터 고민 중요  (public 생략된 것) 
	void update();
	abstract void insert();
}

class OracleServiceImpl /* extends Object*/ implements Service{ // Service를 구현한 클래스
// extends : 한 개만 상속
// implements : 여러 개 와도 됨. 
	
	@Override
	public void delete() {
		System.out.println("oracle delete 작업수행");
	}

	@Override
	public void update() {
		System.out.println("oracle update 작업수행");
	}

	@Override
	public void insert() {
		System.out.println("oracle insert 작업수행");
		
	} //위에 인터페이스를 구현하겠다!
	
}

class MySqlServiceImpl implements Service{
	@Override
	public void delete() {
		System.out.println("mysql delete 작업수행");
	}

	@Override
	public void update() {
		System.out.println("mysql update 작업수행");
	}

	@Override
	public void insert() {
		System.out.println("mysql insert 작업수행");
		
	} 
	
}
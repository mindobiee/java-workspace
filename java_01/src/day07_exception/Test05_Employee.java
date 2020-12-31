package day07_exception;

public class Test05_Employee {

	public static void main(String[] args) throws Exception { // main에서 처리 ! (근데 별로 좋은 코드는 아님) 
		// 에워싼 함수에 try - catch 전가시킨다~!
		Employee e1=null;
		try {
			e1 = new Employee("홍길동","기술부",29);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(e1);
		try {
			e1.setAge(31);
			System.out.println(e1);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// ★ 실무 => 예외 처리가 대부분 !!! 무척 중요하닷 
	}

}

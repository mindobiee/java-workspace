package day07_exception;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("----------------start-----------------");
		
		try {
			int num=10;
			if(num%2==0)
				throw new RuntimeException("~~에러가 발생했습니다.~~~"); // 예외발생하기 (객체가 생성되면 잠을 것) 
		}catch(Exception e) {
			System.err.println(e.getMessage()); // err -> 스트림이 다르므로 순서가 왔다갔다 한다는 것 알아두자!
		}
		try {
			Thread.sleep("3000");// throws 문장이 걸려 있다! 
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("----------------end------------------");
	}

}

package day07_exception;

public class Test01_uncheked {

	public static void main(String[] args) {
		System.out.println("----------------start-----------------");
		
		String msg="-9";
		int num=0;
		String [] s = null;
		// Unchecked exception (컴파일 시 오류 발생 x) 
		// Step by step으로 다 잡아줄것!!!
		try { // try 블록에서 .. (local변수로 작용하므로 이전에 선언 필요 )
			System.out.println("try block 1");
			
			num=Integer.parseInt(msg);  // 숫자 x 
			s = new String[num]; // 음수 안됨
			
			System.out.println("try block 2"); // 수행 x
			 
		}catch(NumberFormatException e) {// null -> 정수로 바꿈 => 오류남. (어떤 값이 들어가느냐에 따라 예외가 발생함)
			System.err.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("정수 숫자를 입력하세요.");
		}catch(NegativeArraySizeException e){
			System.err.println("음수 안됨.");
		}catch(Exception e) {
			//어떤 예외던지 다 잡아준다! 
			System.err.println(e.getMessage());
		}
		finally {
			s=null;// 오류가 발생하면 바로 catch로 넘어오기 때문에, 여기서 자원 반납을 해주어야 한다.
			System.out.println("자원반납 ");
		}
		System.out.println(num);	
		System.out.println("---------------end----------------------");
	}

}

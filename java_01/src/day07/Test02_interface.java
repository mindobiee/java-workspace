package day07;

import javax.swing.JOptionPane;

public class Test02_interface {

	public static void main(String[] args) {
		Command cmd=null; // 부모 타입으로 쓰겠다. 
		
		String msg = JOptionPane.showInputDialog("1.Delete 2. Insert 3. List 4. Update");
		//들어오는 값에 따라서 객체만 바꿔주면 된다. 
		switch(msg) {
			case "1":
				cmd = new DeleteCommand();
				break;
			case "2":
				cmd = new InsertCommand();
				break;
			case "3":
				cmd = new ListCommand();
				break;
			case "4":
				cmd = new UpdateCommand();
				break;
			default:
				System.out.println("다시 입력하세요.");
		}
		if(cmd!=null) { //조건 꼭! 
			cmd.exec();
			cmd.base();
		}
			
		//실행 중 동적 바인딩 해주어야 한다!
	}

}

interface Command{ // 인터페이스 
	void exec();
	default public void base() { // 필요하면 오버라이딩해서 쓰랏!
		System.out.println("~~~Delete command 재정의 ~~~");
	} // 미완성 -> 반드시 누군가가 완성시켜줘야 한다! => default 키워드 넣기 (구현부 가진 메소드) JDK 1.8부터 확장을 위해서 추가됨. 
}

class DeleteCommand implements Command{ //인터페이스를 implements한 class

	@Override
	public void exec() {
		System.out.println("Delete Command 삭제 수행");
	}
	
}
class UpdateCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Update Command 수정 수행");
	}
}
class InsertCommand implements Command{

	@Override
	public void exec() {
		System.out.println("Insert Command 생성 수행");
	}
}
class ListCommand implements Command{

	@Override
	public void exec() {
		System.out.println("List Command select 수행");
	}
}
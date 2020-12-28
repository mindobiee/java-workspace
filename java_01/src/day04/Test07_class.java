package day04;

public class Test07_class {

	public static void main(String[] args) {
		/*
		 * class=variable+,method
		 * */
		Employee emp1 = new Employee();	//클래스 정의 필요함. + new
		// emp1: 주소
		// 값을 대입하는 작업 필요함. 
		emp1.name="홍길동";
		emp1.dept="기술부";
		emp1.age=29;
		emp1.print();
		
		Employee emp2 = new Employee();
		emp2.name="고길동";
		emp2.dept="영업부";
		emp2.age=26;
		emp2.print();
		
		Employee emp3 = new Employee();//객체 생성
		emp2.print(); //초기값으로만 출력됨.
		
		//회사의 사원이 많으면 배열로 선언함.
		Employee[] employees1 = new Employee[100];
		Employee[] employees = {emp1, emp2, emp3, null, null, null, null};//생성과 동시에 초기화
		
		// employees 에서 "영업부"에 근무하는 사원목록 !
		for(int i=0; i<employees.length;i++) { // 배열은 무조건 for loop
			if(employees[i]!=null && employees[i].dept!=null){ // NULLpointer Exception 처리!
				// 예외 발생에서 죽으면 알고리즘은 No...! (조건식이 굉~~장히 중요해요) 
				if (employees[i].dept.equals("영업부"))
					employees[i].print();
			}
		}	
	}
}

// 새로운 데이터 타입이 만들어졌다!
class Employee{ // 사원 --> 사원관리 프로그램 (배열과 사용자 정의 클래스 만들어봄)
	// 데이터 + 기능 : 떠오르는 단어들 -> 명사 + 동사
	String name; 	//이름
	String dept; 	//부서
	int age;		//나이
	
	//세금계산
	public void print() {
		//정보출력
		System.out.printf("[사원명 :%s|근무부서:%s|나이:%d]%n",name,dept,age);
	}
	
}
// 이렇게 class를 하나 만들면, 하드디스크에 Employee.class로 만들어져있음. -> 메모리에 띄우려면 new 키워드 필요.
package Labs;
import util.Student;
import util.Employee;
import util.Person;
import util.Teacher;

public class day06_1 {

	public static void main(String[] args) {
		Person[] persons = {
				new Student("홍길동", 20, 200201),
				new Teacher("이순신",30, "JAVA"),
				new Employee("유관순", 40,"교무과"),	
		}; // 클래스 new 배열 ! (한 번에 집어넣을 수 있다. ) 
		
		for(Person person:persons) {
			person.print(); // 오버라이딩 ok! 
		}
		/*         <동일한 결과> 
		 *  이 름:홍길동, 나 이:20 학 번:200201 
			이 름:이순신, 나 이:30 담당과목:JAVA 
			이 름:유관순, 나 이:40 부 서:교무과 
		*/
		
		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신",30, "JAVA");
		Employee e = new Employee("유관순", 40,"교무과");
		s.print();
		t.print();
		e.print();
	
	}

}

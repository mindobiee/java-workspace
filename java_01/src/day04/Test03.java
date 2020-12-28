package day04;

public class Test03 {

	public static void main(String[] args) {
		int[] num1 = {66,77,33,55,100}; // 한 라인에서 할 때만 가능
		
		//or
		int[] num2 = null;
		num2= new int[] {66,77,33,55,100};
		
		// 주소 참조
		int num3[]=num1;// 같은 주소값 가짐.
		int[] num4=num3.clone(); // 복제된 주소를 넣는 것. (원래의 데이터 이용할 때)
		
		if(5 < num1.length) num1[5]=11; // 인덱스가 범위내 있는지 check!
		num3[0]=22;
		num4[0]=33;
		
		num1=null;
		num3=null;
		
		// 셋 다 같은 곳을 참조 ==> 주소 (하나의 메모리의 객체)
		System.out.println("-------------------------------------");
		
		
	}

}

package day04;

public class Test04_afterLunch {

	public static void main(String[] args) {
		int[] num = new int[]{5,9,1,4,3};
		// 메모리에 할당되면, resize가 불가능함.
		// 더 큰 배열 만들고, 이 데이터를 그 배열에 넣는 작업 by API
		
		int[] num1 = new int[num.length*2]; // 0이상의 크기가 오면 ok! (num 배열의 두 배만큼의 size)
		System.arraycopy(num, 0, num1, num.length, num.length); //api 사용 ... ??왜 안되지 
		// 자바의 주소 ; object (상속 후에 이유 공개 예정)
		
		String[] data = "고길동/99/77/100".split("/"); // 데이터를 잘라야 의미가 있음. ("/")를 기준으로 자름.
		double sum=0;
		for(int i=1;i<data.length;i++) {
			sum+=Double.parseDouble(data[i].trim()); // 공백 제거하여  double형으로 저장
		}
		System.out.printf("%s : %.2f", data[0], sum/3); // 데이터 가공
		
		// 데이터 쪼개기 => 문자열 
	}

}

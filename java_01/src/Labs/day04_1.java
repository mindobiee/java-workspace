package Labs;

public class day04_1 {

	public static void main(String[] args) {
		//1. 문자열 참조변수  msg 가 "yes" 일때 true 인  조건식 
		String msg="yes";
		if (msg.equals("yes")) // 대소문자 구분..?
			System.out.println("[1]True");
		//2. 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때 
	      // 몇까지 더해야 총합이  100  이상이 되는지 구하시오 .
		int sum=0,i=1;
		int number;
		while (sum<100) {
			if(i%2==1)
				sum+=i;
			else 
				sum-=i;
			if (sum>=100)
				System.out.println("[2]"+i);
			i++;
		}
		//3. arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성하시오 .
		int[] arr = {10, 20, 30, 40, 50}; 
		
		// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		sum=0;
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
		}
		System.out.println("[3]sum="+sum);
		 
			
		
		
	}

}

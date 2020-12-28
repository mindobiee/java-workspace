package day03;

public class Test05_for2 {

	public static void main(String[] args) {
		//1~100 까지의 합
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%2==0) { // 짝수일 때만 더하기 
				sum+=i;
				System.out.printf("%d %n",i);
			}
		}
		System.out.println(sum);
		
		// 2차원 배열 : 중첩 for loop 써야 함.
		for(int i=1;i<3;i++) {
			for(int j=9;j>7;j--) {
				System.out.printf("%d * %d = %d %n", i,j,i*j);
			}
		}
		
		
	}

}

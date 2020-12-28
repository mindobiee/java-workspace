package Labs;

public class day03_3 {

	public static void main(String[] args) {
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 구해 보세요.
		int sum=0;
		
		//1.
		for(int i=1;i<=10;i++) {
			sum=sum+i*(11-i);
		}
		
		//2. 
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if (j>i) break; // 갯수 counting
				sum+=j; // 안쪽 for문 j를 더해주기!
			}
		}
		
		System.out.println("1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과는?"); //220 (1,2번 동일)
		System.out.println(sum);

	}

}

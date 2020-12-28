package Labs;

public class day03_2 {

	public static void main(String[] args) {
		/*[2] 1부터 20까지의 정수 중에서 
    		2또는 3의 배수가 아닌 수의 총합을 구해 보세요  .*/
	 
		int sum = 0; 
		//ToDo
		for(int i=1;i<=20;i++) {
			if(!(i%2==0 || i%3==0)) // 나누어떨어지지 않는!
				sum+=i;
		}
		
		System.out.println("sum="+sum);  
	

	}

}

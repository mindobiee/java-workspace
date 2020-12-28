package day04;

public class Test06_multiarray {
	
	// 2차원 배열 -> 1차원 배열을 모아서 관리하는 것
	public static void main(String[] args) {
		int[] num1= {1,1,1,1,1};
		int[] num2= {2,2,2,2,2};
		int[] num3= {3,3,3,3,3};
		
		// 행=열 갯수가 같은 때 : 정방형
		// 같지 않을 때도 있다. 
		
		int[][] two= {num1,num2,num3};
		
		for(int row=0; row <two.length; row++) {
			for(int col =0; col<two[row].length;col++ ) {
				System.out.printf("%d ",two[row][col]);
			}
			System.out.println();
		}
		// 그래프 순회 : 이차원 배열!
		int N=7;
		int[][] two1 = new int[N][N]; // 7행 7열이 되는 것!
		two1[2][3]=99;
		
		int[][] two2 = {
				{}, // 0번째 인덱스는 안쓰는게 ok!
				{90,40,88,99,89},
				{33,99,44,77,88,67,89},
				{99,89,100}
		};
		//반별 평균 점수
		for(int i=1;i<two2.length;i++) { // 1번째 row로 하면 예외조건 필요 x
			int avg=0;
			for(int j=0;j<two2[i].length;j++) {
				avg+=two2[i][j];
			}
			//if(i!=0) : 예외 조건 필요함. 
			System.out.printf("[%d반 평균 성적:%.2f점입니다.]%n", i, (double)avg/two2[i].length);
		}

	}
}

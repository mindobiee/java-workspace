package Labs;

import java.util.Arrays;

public class day05_2 {
// sort  함수 추가  선언부를 고민해 보세요 ? 
//	1. 정렬할 int 배열을 넘겨 받고 
//	  오름 차순으로 정렬후  정렬 결과를 리턴한다.
	
	public static void main(String[] args) {
		int[] a= new int[10];
		a=new int[] {10,9,8,7,6,1,2,5,4,1};
		System.out.println(sort(a));
		
	}
	
	public static String sort(int[] a) {
		
		//선택 정렬
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]){	//앞에 있는 원소가 더 크면 자리바꿈. 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;}
			}
		}
		//배열을 string으로 바꾸기
		
		return Arrays.toString(a);// 배열을 스트링으로 바꾸기 
	}

}

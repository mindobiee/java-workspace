package day05;

import java.util.Arrays;

public class Prob05_김민경 {
	
	public static void main(String[] args) {
		int[] a= new int[10];
		a=new int[] {10,9,8,7,6,1,2,5,4,1};
		System.out.println(sort(a));
		
	}
	
	public static String sort(int[] a) {
		//String 원본은 바뀌지 x(기본형) -> arr건드리면 원본이 바뀜. 
		int[] res = a.clone(); // 복사해서 사용가능
		//정렬
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]>a[j]){	 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;}
			}
		}
		
		return Arrays.toString(a);
	}

}

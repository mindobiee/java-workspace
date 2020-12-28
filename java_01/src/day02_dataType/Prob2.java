package day02_dataType;

import javax.swing.JOptionPane;

public class Prob2 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("숫자를 입력하세요."));
		// 오른쪽 항이 string 타입이므로 정수로 파싱하는 작업 필요!
		// dialog 창을 통한 사용자가 직접 숫자 입력! 
		
	    System.out.printf("%d = ",num);    
		//삼항 연산자 -> 중첩으로 써보기
	    //" 양수 음수  0 중 하나 출력"
	    System.out.println(num==0?"0":(num>0?"양수":"음수"));
	    
	    char ch = JOptionPane.showInputDialog("문자를 입력하세요.").charAt(0);//문자 하나 꺼내기
		// 데이터 타입 불일치 :? String의 문자 하나 -> 문자 char
	    // String 전체 : for문 이용해서 변환 ok!
	    
	    /*
	       	다음은 대문자를 소문자로 변경하는 코드입니다.
			변수 ch에 저장된 문자가 대문자 인 경우에만 
			소문자로 변경하는 코드를 완성 합니다.
	  	*/
	    // API 
	    if (Character.isUpperCase(ch)) 
	    	ch=Character.toLowerCase(ch);
	    // 관계 연산자
	    // 성능이 더 빠름
	    if (ch>'A'&&ch<'Z') // 대문자가 먼저 있고, 소문자가 뒤에 있어서 +32를 해야함. 
	    	ch+=32;
		System.out.printf("ch=%c %n",ch);  
		System.out.printf("ch=%c %n",(char)ch);
		
		
		/*
		 * 입력하지 않으면 application이 죽게 됨. 
		 * 예외처리 !!!! (해결해볼 것)
		 * at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)	
		 * 
		 * */

	}

}

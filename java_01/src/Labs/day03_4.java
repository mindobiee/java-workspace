package Labs;

public class day03_4 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		char a_word=' ';	
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		// a~w : +3, x,y,z : -23	
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<sourceString.length();i++) {
			a_word=sourceString.charAt(i);
			if (a_word>='a' && a_word<='w') // 세 글자 뒤의 글자로 변경
				sb.append((char)(a_word+3)); // char를 붙여주어야 숫자로 인식x
			else if(a_word>='x' && a_word<='z') // x->a,y->b,z->c로
				sb.append((char)(a_word-23));
			else // 공백은 동일하게 !
				sb.append(" ");
		}
		encodedString=sb.toString();

		// 프로그램 구현부 끝.
				
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
		/*
		 * 암호화할 문자열 : everyday we have is one more than we deserve
			암호화된 문자열 : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		*/
		
	}

}

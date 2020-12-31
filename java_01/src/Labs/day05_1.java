package Labs;

public class day05_1 {

	public static void main(String[] args) {
		// static -> class 이름만 사용하면 됨. 
		System.out.println( leftPad("SDS", 6, '#') );
		System.out.println( day05_1.leftPad("SDS", 5, '$') ); 
		System.out.println( day05_1.leftPad("SDS", 2, '&') ); 
	}
	public static String leftPad(String str, int size, char padChar) {
		// static 이 없으면, new를 해서 인스턴ㅅ로 사용해야 한다.
		/*  여기에 프로그램을 완성하십시오. */
		/*
		 * 
		입력 문자열(str)의 길이가 입력받은 수(size)가 될 때까지 
        	문자열의 좌측을 지정된 문자(padChar)로 채운 후 리턴한다.
        	단, 입력 문자열(str)의 길이가 입력받은 수(size) 보다 
             	큰 경우에는 원본 문자열(str)을 그대로 리턴한다.
		 */
		StringBuilder sb = new StringBuilder();
		int strlength=size -str.length();
		if(strlength<0)
			return str;
		else {
			for (int i=0;i<strlength;i++)
				sb.append(padChar);
			sb.append(str);
			return sb.toString();
		}
		
	}

}

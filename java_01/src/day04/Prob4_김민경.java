package day04;

public class Prob4_김민경 {

	public static void main(String[] args) {
		
		/*문자를 역순으로 출력한다.*/
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		//StringBuilder sb = new StringBuilder();
		for(int i=0;i<strData.length;i++) {// 배열 -> 경계선 check 중요
			for(int j=strData[i].length()-1;j>=0;j--) {
				System.out.printf("%c",strData[i].charAt(j));//배열 당 문자열(인덱스)하나씩 접근
				char[] ch = strData[i].toCharArray(); //string -> char의 배열로도 변환 가능
				for(int idx=ch.length-1;idx>=0;idx--) {
					System.out.print(ch[idx]);
				}
			}
			System.out.println();
		}
	}
}
/*<결과>
gnimmargorP avaJ
CBDJ
g01elcarO
telvreS/PSJ
*/

package Labs;

public class day04_2 {

	public static void main(String[] args) {
		
		/*문자를 역순으로 출력한다.*/
		String[] strData  = { "Java Programming" , "JDBC", "Oracle10g", "JSP/Servlet" };
		//StringBuilder sb = new StringBuilder();
		for(int i=0;i<strData.length;i++) {
			for(int j=strData[i].length()-1;j>=0;j--) {
				System.out.printf("%c",strData[i].charAt(j));
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

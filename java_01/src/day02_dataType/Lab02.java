package day02_dataType;

public class Lab02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1+2);
		   System.out.println('1'+'2');
		   System.out.println("1"+"2");
		   System.out.println("~~ "+1+2);
		   System.out.println(1+2+"~~");
		   System.out.println("Hello"+"java"+'!'); 
		
//		   a. $ystem (0)
//		   b. num#5 (0)
//		   c. 7num 
//		   d. 자바 
//		   e. new 
//		   f. new_ (0)
//		   g. $MAX_NUM (0)  
//		   h. hello@com (0)
		   
		   //byte b = 256; 
		   //char c = ''; 
		   //char answer = 'no'; 
		   //float f = 3.14;  
		   double d = 1.4e3f; // 1400.0 
		   System.out.println(d); 
		   
		   	int x = 2;
			int y = 5;
			char c = 'A'; // 'A' 65 
			System.out.println(y >= 5 || x < 0 && x > 2); // true
			// 비교 연산자 우선순위 && > ||
			System.out.println( !('A' <= c && c <='Z') ); // false
			System.out.println('C'-c);                    // 2    
			System.out.println('5'-'0');                  // 5 
			System.out.println(c+1);                         
			System.out.println(++c);                          
			System.out.println(c++);                          
			System.out.println(c);  
/* 결과 
* true
false
2
5
66
B
B
C
			 */
	}

}

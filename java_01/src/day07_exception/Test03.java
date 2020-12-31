package day07_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("start");
		Scanner scanner = null;
		
		//scanner = new Scanner(System.in); // 보통 스캐너를 생성 시 키보드로 입력 받음 
		try {
			scanner = new Scanner(new File("data.txt")); // 파일로 입력 받아본다 
			//scanner.close();
			while(scanner.hasNextLine()) { // 한줄씩 
				System.out.println(scanner.nextLine()); // 읽기
			}
			
		}catch(FileNotFoundException e) { //파일이 존재하지 x 오류!  
			System.out.println("data.txt 파일 준비하세요.");
		}finally {
			// 스캐너는 자원 블럭을 정확하게 해줘야 한다!!
			if(scanner!=null) {
				scanner.close(); //여기서 예외 발생 ! (nullpointException) -> if 써줌. 
				scanner=null;
			}
		}
		System.out.println("end");
		
	}

}

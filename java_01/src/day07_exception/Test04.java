package day07_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("start");
	
		try(Scanner scanner = new Scanner(new File("data.txt"));) { // 여기에 변수 선언까지 하면 => 자원반납 자동적으로 됨! (finally에서 안해도됨) 
			while(scanner.hasNextLine()) { 
				System.out.println(scanner.nextLine()); 
			}
		}catch(FileNotFoundException e) {  
			System.out.println("data.txt 파일 준비하세요.");
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("end");
	}
}

package chpater01;

import java.util.Scanner;

public class EX31ScannerTest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		// 정수 입력 받기		
		System.out.println("이름:");
		String name = scanner.next();
		
		System.out.println("가격:");
		int price= scanner.nextInt();
		
		System.out.println("제고량:");
		int countstck = scanner.nextInt();
		
		System.out.println(name+":"+price+":"+countstck);
		
	}

}

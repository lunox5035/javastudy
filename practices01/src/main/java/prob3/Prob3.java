package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		/* 코드 작성 */
			System.out.print("숫자를 입력하세요:");
			int num= scanner.nextInt();
			int a = 0;
			int n = 0;
			
			if (num==0) {
				System.out.println("종료합니다.");
				break;
			}
			
			
			if (num%2!=0) {
				a=1;		
			}
			
			for (int i=a; i<=num; i=i+2) {
				n=n+i;
			}

			
			
			System.out.println("결과값 :"+n);
			
		}
		
			
//		scanner.close();
	}
}
	
package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );

		while( true ) {
			
			/* 게임 작성 */

			// 정답 램덤하게 만들기
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
//			System.out.println(correctNumber);

			System.out.println("수를 결정하였습니다.:"+correctNumber);

			int low= 1;
			int high=100;
			
			while(true){
				System.out.print(low+"-"+high);
				System.out.print(">>");
				int answer = scanner.nextInt();
								
				if(answer == correctNumber) {
					System.out.println("정답입니다");
					break;
				}else if(answer > correctNumber) {
					System.out.println("더 낮게");
					high= answer;
				}else if(answer < correctNumber) {
					System.out.println("더 높게");
					low=answer;
				}
			}
				
			
			
			//새 게임 여부 확인하기
			System.out.print( "다시 하겠습니까(y/n)>>" );
			String answer = scanner.next();
			if( "y".equals( answer ) == false ) {
				break;
			}
		}
		
		scanner.close();
	}

}
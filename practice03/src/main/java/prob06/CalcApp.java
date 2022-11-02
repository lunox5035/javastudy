package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);				//스캔
		
		while( true ) {
			/*  코드를 완성 합니다 */
			System.out.print( ">> " );							//시작표시
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {					//종료신호
				break;
			}
			
			String[] tokens = expression.split( "" );			
			
			if( tokens.length != 3 ) {							//오류표시:
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );		//왼쪽 숫자
			int rValue = Integer.parseInt( tokens[ 2 ] );		//오른쪽 숫자
			
		
			
			
			switch( tokens[ 1 ] ) {								//사칙연산 구분
				case "+" : {									//더하기 구분
					Add add = new Add();
					add.setValue( lValue, rValue );
					int result = add.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "-" : {									//빼기 구분
					Sub sub = new Sub();
					sub.setValue( lValue, rValue );
					int result = sub.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				case "*" : {									//하기 구분
					Mul mul = new Mul();
					mul.setValue( lValue, rValue );
					int result = mul.calculate();
					System.out.println( ">> " + result );
					
					break;					
				}
				case "/" : {									//나누기 구분
					Div div = new Div();
					div.setValue( lValue, rValue );
					int result = div.calculate();
					System.out.println( ">> " + result );
					
					break;
				}
				default :  {									//예외처리
					System.out.println( ">> 알 수 없는 연산입니다.");
				}
			}
		}
		
		scanner.close();

	}

}

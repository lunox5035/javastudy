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
			
			Arith arith=null;			
			
			switch( tokens[ 1 ] ) {								//사칙연산 구분
			
				case "+" : {	
					arith=new Add();
					
					break;
				}
				case "-" : {	
					arith= new Sub();
					
					break;
				}
				case "*" : {	
					arith= new Mul();
					
					break;					
				}
				case "/" : {			
					arith= new Div();
					
					
					break;
				}
//				default :  {									//예외처리
//					System.out.println( ">> 알 수 없는 연산입니다.");
//				}
				
//				if (arith==null) {
//					System.out.println(">> 알 수 없는 연산입니다.");
//					continue;
//				}

				arith.setValue(lValue,rValue);	
				System.out.println(">>"+arith.calculate());
				
			}
		}
		
		scanner.close();

	}

}

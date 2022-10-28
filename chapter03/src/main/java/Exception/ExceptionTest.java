package Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;

		System.out.println(1);
		try {

			System.out.println(2);
			int result = (1 + 2 + 3) / b;

			System.out.println(3);
			
		} catch (ArithmeticException e) {//e=변수
				/*예외처리*/
			//1. 사과
			System.out.println("미안합니다.");
			
			//2. 로깅 로그작성
			System.out.println("err: "+e);
			
			//3. 정상종료
			//System.exit(0);
			return;
		}finally {
			//예외여도,예외가 아니여도 반드이 실행되는 블럭
			//네트워크 db io등 종료....기타등등 자원정리
			System.out.println("finally call");
		}
		//예외발생이후 실헹되는 코드:비추
//		System.out.println(4);

	}

}

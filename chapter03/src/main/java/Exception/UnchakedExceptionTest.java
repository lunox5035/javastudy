package Exception;

public class UnchakedExceptionTest {

	public static void main(String[] args) {
		//Unchecked Exception는 예외처리 없이 발생해야 한다.
		//why? 예외 보고 수정해야하는 로직[에러]이기 떄문이다.
		
		
		//ArrayIndexOutOfBoundsException
		//ArithmeticException
		//NullPointException
		//등등		
		
//		try {
			int[] a = { 1, 2, 3, 4, 5 };

			for (int i = 0; i <= 5; i++) {
				System.out.println(a[i]);
			}
//		} catch (Exception e) {
//			System.out.println("Error!");
//			System.out.println("erroelog: " + e);
//			return;
//		}
	}

}

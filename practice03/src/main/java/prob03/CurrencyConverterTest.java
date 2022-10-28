package prob03;

public class CurrencyConverterTest {
	
	
public static void main(String[] args) {
		// 환율을 세팅 합니다.
		CurrencyConverter.setRate(1197.0); // CurrencyConverter의 rate에 1197.0 입력

		double dollar = CurrencyConverter.toDollar(1000000.);
		System.out.println("백만원은 " + dollar + "달러 입니다"); // dollar=1000000/1197

		double krw = CurrencyConverter.toKRW(100);
		System.out.println("백달러는 " + krw + "원 입니다"); // toKRW=100*1197
	}
 
}

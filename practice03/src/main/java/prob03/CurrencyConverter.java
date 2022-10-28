package prob03;

public class CurrencyConverter {

	private static double dollar;
	private static double krw;
	private static double rate;

	public CurrencyConverter(double dollar, double krw, double rate) {
		this.dollar = dollar;
		this.krw = krw;
		this.rate = rate;
	}

	public static double toDollar(double won) {
		return won = dollar * rate;
	}

	public static double toKRW(double dollar) {
		return dollar = krw / rate;
	}

	public static void setRate(double r) {
		// 환율 설정(KRW/$1)
		return krw/r;
	}

}

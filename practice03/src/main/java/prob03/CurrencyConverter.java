package prob03;

public class CurrencyConverter {
	private Double dollar;
	private Double krw;
	private Double rate;	
	
	public void setDollar(Double dollar) {
		this.dollar = dollar;
	}

	public void setKrw(Double krw) {
		this.krw = krw;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	
	
	public CurrencyConverter() {

	}
	
	public CurrencyConverter(Double dollar,Double krw,Double rate) {
		this.dollar=dollar;
		this.krw=krw;
		this.rate=rate;
	}



	public Double getDollar() {
		return dollar;
	}

	public Double getKrw() {
		return krw;
	}

	public Double getRate() {
		return rate;
	}

	public double toKRW() {
		return krw*rate;
	}

	


	public double toDollar() {
		return dollar/rate;
	}
}

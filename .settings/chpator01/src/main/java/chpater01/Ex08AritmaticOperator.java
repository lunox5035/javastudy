package chpater01;

public class Ex08AritmaticOperator {
	

	public static void main(String[] args) {
		final int
		TIME = 20000; //20000초

		int hours =0;
		int minutes =0;
		int seconds =0;

		hours= (TIME/60)/60;
		minutes= (TIME/60)%60;
		seconds= TIME%60;
		
		
		
		System.out.println(TIME+"초는"+hours+"시간"+minutes+"뷴"+seconds+"초 입니다.");
	}
}
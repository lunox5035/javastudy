package chapter04;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean bl = new Boolean(true);

		// Aoto Boxing 콘스탄트플
		Integer i2 = 10;
		Long l = 10L;

		System.out.println(i2 == 10);// 오토언박싱
//		=System.out.println(i2.intValue() == 10);

		System.out.println(i2.equals(10)); // 오토박싱
//		= System.out.println(i2.equals(new Inteher (10)));

	}

}

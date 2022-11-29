package chpater01;

public class EX29PrineDetect {

	public static void main(String[] args) {
		// 2~1000 까지에서 소수를 화면에 출력해세요

//		int num=5;

		int i = 2;
		while (i < 1000){

			boolean isprime = true;
			for (int num = 2; num < i; num++) {
				if (i % num == 0) {
					isprime = false;
					break;
				}
			}
			
			if (isprime==true) {
				System.out.println(i);
			}
			i++;

		}

	}

}
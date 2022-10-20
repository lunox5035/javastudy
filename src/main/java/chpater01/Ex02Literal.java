package chpater01;

/*
 * 리터널(literal)이란? 
 * 프로그렘에 직접적으로 표현된 상수
 *
 */

public class Literal {

	public static void main(String[] args) {		
		float f = 3.14f;
		double d = 3.14;		
		
		short s =1;
		int i = 1;
		long l = 1234567890L;
		
		char c = 'A';
		byte b = 65;

		boolean bool = true;
		
		System.out.println(f);
		System.out.println(d);

		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println((char)b);
		
		System.out.println(bool);
	}

}

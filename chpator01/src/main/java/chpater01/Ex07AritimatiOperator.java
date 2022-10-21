package chpater01;

public class Ex07AritimatiOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 7;

		// binary operator
		System.out.println(a+b);	//10
		System.out.println(a-b);	//-4
		System.out.println(a*b);	//21
		System.out.println(a/b);	//0
		System.out.println(a%b);	//3

		//unary operator

		System.out.println(-a);		//-3
		System.out.println(++a);	//4
		System.out.println(--b); 	//6
		System.out.println(a++);	//4 함수호출 후 연산
		System.out.println(b--);	//6
		
		a=7;

		System.out.println(a--);	//6
		System.out.println(a);	//6
		System.out.println(++a);	//6
		System.out.println(a);	//7
		

	}

}

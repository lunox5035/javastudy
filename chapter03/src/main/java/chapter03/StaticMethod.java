package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	
	
	void fa() {
		System.out.println(StaticMethod.n);	
	}
	void f2() {
		System.out.println(StaticMethod.m);
		//같은 클래스의 클래그(Static)변수 접근에서는 클래스 이름 생략이 가능하다.
		
	}
	

	void f3() {
		f2();
	}
	
	static void s1() {
		//오류: static method
		//
	}

	static void s2() {
		System.out.println(StaticMethod.m);
		//같은 클래스의 클래그(Static)변수 접근에서는 클래스 이름 생략이 가능하다.		
	}

	static void s3() {
		//오류 : static method에서는 인스턴스 메소드에 접근할 수 없다.
		//f1();
	}
	
	static void s4() {
		StaticMethod.s1();
		//같은 클래스의 클래스(static)메소드접든에서는 클래스 이름 생략이 가능하다.
		s1();
	}
	
}

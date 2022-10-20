package chpater01;

public class Ex14IfStatement {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;

		System.out.println("초기값");
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		// 최댓값은 50
		
		final int a = n2-n1;
		
		if (n1<=n2) {
			n1=n1+a;
			n2=n2-a;
		}
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		
		
	}

}

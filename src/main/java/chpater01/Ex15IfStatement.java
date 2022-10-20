package chpater01;

public class Ex15IfStatement {

	public static void main(String[] args) {
		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		int max = ' ';
		
		if (a1 >= a2) {
			if (a1>=a3) {
				max=a1;
			}else if(a3>=a2) {
				max=a2;
			}else{
				max=a3;
			}
		}
		System.out.println("최댓값은" + max + "이다.");

	}

}

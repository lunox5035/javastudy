package chpater01;

public class Ex28Continue {

	public static void main(String[] args) {
		forTest(); 
		// while문에  
		WhileTest();
	}
	static void forTest() {
		for (int i = 0; i<10; i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

	static void WhileTest() {
		int i = 0;
		while(i<10) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}
}

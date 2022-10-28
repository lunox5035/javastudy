package Exception;

public class MycalssTest {

	public static void main(String[] args) {
		try {
			Mycalss myclass = new Mycalss();
			myclass.danger();
		} catch (MyException e) {
			System.out.println("erroe: " + e);
		}

	}

}

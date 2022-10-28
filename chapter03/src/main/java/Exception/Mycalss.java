package Exception;

import java.io.IOException;

public class Mycalss {

	public void danger() throws MyException{
		System.out.println("some code1");

		if (1 - 1 == 0) {
			throw new MyException();
		}
			System.out.println("some code2");

		
	}
}

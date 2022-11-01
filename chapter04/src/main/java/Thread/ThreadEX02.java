package Thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadEX02 {
	public static void main(String[] args) {
		List list =new ArrayList();
		
		Thread thread1=new DigitThread(list);
		Thread thread2=new AlphabetThread(list);

		thread1.start();
		thread2.start();
	}
}

package Thread;

import java.util.List;

public class DigitThread extends Thread {
	public List list;

	public DigitThread () {
	
	}

	public DigitThread(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		
		synchronized(list) {
			list.add(null);
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	private void synchonized(List list2) {
		// TODO Auto-generated method stub
		
	}
}

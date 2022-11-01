package Thread;

import java.util.List;

public class AlphabetThread extends Thread {
	public List list;

	public AlphabetThread () {
	
	}

	public AlphabetThread(List list) {
		this.list = list;
	}
	
	@Override
	public void run() {
		
		synchronized(list) {
			list.add(null);
		}
		
		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(c);
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
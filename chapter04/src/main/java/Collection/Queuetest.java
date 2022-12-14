package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queuetest {

	public static void main(String[] args) {
		
		Queue<String>q=new LinkedList<>();
		
		q.offer("마이콜");
		q.offer("둘리");
		q.offer("도우너");
		
		while(!q.isEmpty()) {
			String s=q.poll();
			System.out.println(s);
		}

		System.out.println("=========================");
		q.offer("마이콜");
		q.offer("둘리");
		q.offer("도우너");

		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		//비어있는 경우는 null을 반환한
		System.out.println(q.poll());
		
		
	}

}

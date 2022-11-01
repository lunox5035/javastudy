package prob5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyStack {

	private String[] buffer;

	public MyStack(int size) {

		buffer = new String[size];

	}

	public void push(String string) {
		int top = 0;
//		while (buffer[top] != null) {	// top값 찾기 
//			top += 1;
////			if (buffer[top] == null) {
////				break;
////			}
//		}
		for (int i=0;i<buffer.length;i++) {
			if(buffer[i]!=null) {
				top++;
			}
		}

		if (buffer.length == top) {

			String arr[] = new String[(buffer.length * 2)];
			for (int i = top; i < top; i++) {
				arr[i] = buffer[i];
			}
			buffer = arr;
		
//			buffer= Arrays.copyOf(buffer, buffer.length-1);
			
			
		}
		buffer[top] = string;
			
		}
		
		
	public String pop() {
//		String s = buffer[0];
//		buffer[0] = null;
//		return s;
		
		int i=0;
		while(true) {
			if(buffer[i]!=null) {
				String s = buffer[i];
				buffer[i] = null;
				return s;
			}
			i++;
		}
		
		
	}

	public boolean isEmpty() {
		if (buffer != null) {
			return true;
		}
		return false;
	}

}
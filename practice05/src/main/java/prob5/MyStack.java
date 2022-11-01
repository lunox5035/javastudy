package prob5;

import java.nio.Buffer;
import java.util.Stack;

public class MyStack {

	private String[] buffer;

	public MyStack(int size) {
		buffer = new String[size];

	}

	public void push(String string) {
		int top = 0;
		while (buffer[top] != null) {
			top += 1;
		}

		if (buffer.length == top) {
			String arr[] = new String[(buffer.length * 2)];
			for (int i = top; i < top; i++) {
				arr[i] = buffer[i];
			}
			buffer = arr;
			buffer[top] = string;
		}

	}

	public String pop() {
		String s = buffer[0];
		buffer[0] = null;
		return s;

	}

	public boolean isEmpty() {
		if (buffer != null) {
			return true;
		}
		return false;
	}
	
}
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
		for (int i=0;i<buffer.length;i++) {						//비어있지 않은 배열 갯수=현재 top값
			if(buffer[i]!=null) {
				top++;
			}
		}

		if (buffer.length == top) {								//top이랑 배열 길이가 같으면

			String arr[] = new String[(buffer.length * 2)];		//임의의 배열길이를 2배의 배열을 만든다
			for (int i = top; i < top; i++) {					
				arr[i] = buffer[i];								//내용 추가
			}
			buffer = arr;										//기본배열을 새 배열로 대체
		
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
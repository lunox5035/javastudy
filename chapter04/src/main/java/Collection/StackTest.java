package Collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> Stack = new Stack<>();
				
		Stack.push("Hello");
		Stack.push("World");
		Stack.push("!!!");
		Stack.push("java");
		Stack.push(".");
		
		while(!Stack.isEmpty()) {
			String s=Stack.pop();
			System.out.println(s);
		}
		System.out.println("======================");
		
		Stack.push("Hello");

		System.out.println(Stack.pop());
		
//		System.out.println(Stack.pop());
		//비어있는경우 ,pop()을 호출하면 예외가 발생
		//System.out.println(Stack.pop());
		
		Stack.push("둘리");
		Stack.push("마이콜");
		Stack.push("도우너");

		System.out.println(Stack.pop());
		System.out.println(Stack.peek());
		System.out.println(Stack.pop());
		System.out.println(Stack.pop());
		
		
		
		
	}

}

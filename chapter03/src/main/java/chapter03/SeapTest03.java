package chapter03;

public class SeapTest03 {

	public static void main(String[] args) {
		IntValue a =new IntValue(10);
		IntValue b =new IntValue(20);
		
		System.out.println(a.value+":"+b.value);

		swap(a,b);
		
		System.out.println(a.value+":"+b.value);
		
	}	
	public static void swap(IntValue m, IntValue n) {
		int temp = m.value;
		m.value=n.value;
		n.value=temp;
		
	}

}

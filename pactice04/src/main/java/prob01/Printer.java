package prob01;
//오버로드
public class Printer {

////	public void printer() {
////		System.out.println();
////	}
//
//	public void println(int i) {
//		System.out.println(i);
//	}
//		
//	public void println(Boolean i) {
//		System.out.println(i);
//	}
//
//	public void println(Double i) {
//		System.out.println(i);
//	}
//		
//	public void println(String i) {
//		System.out.println(i);
//	}
		
//	public <T> void println(T t) {
//		System.out.println(t);
//	}
	
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.println(t);
		}
	
	}
	
	
	public int sum(int...  nums) {
		int sum = 0;
		for (int i:nums){
			sum+=i;
		}
		return sum;
	
	
	}
	
}

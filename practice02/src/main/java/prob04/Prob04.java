package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		
		return null;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		String reverse = "";
		for (int i=array.length-1;i>0;i--) {
			reverse=reverse+array[i];
		}
		
		
		
		
		
		
		
		
		System.out.println(reverse);
	}
}
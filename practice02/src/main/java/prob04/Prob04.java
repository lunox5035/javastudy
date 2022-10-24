package prob04;

import java.nio.file.attribute.AclEntry;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);
		
		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}
	
	public static char[] reverse(String str) {
		char[] cs = str.toCharArray();
		
		char[] array = new char[cs.length];
		int startIndex = 0;
		for (int i=cs.length-1; i>=0;i--){
//		for (int i=0; i< cs.length; i++){
			array[startIndex++] =  cs[i];
		}
		return(array);
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		
		System.out.println(array);
	}
}
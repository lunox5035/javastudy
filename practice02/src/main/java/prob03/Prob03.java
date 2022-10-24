package prob03;

import java.security.PublicKey;

public class Prob03 {
	public static void main(String args[]) {
			char[] charArray = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };


			
			
			
			// 원래 배열 원소 출력
			printCharArray(charArray);

			// 공백 문자 바꾸기
			replaceSpace(charArray);
			

			// 수정된 배열 원소 출력
			printCharArray(charArray);
		}
		
		public static void printCharArray(char[] cs) {
			System.out.println(cs);
		}
		
		public static void replaceSpace(char[] cs) {
			char[] as = new char[cs.length];
			for(int i=0; i<cs.length; i++){
				as[i]=cs[i];
			}
			for (int i=0;i<as.length ;i++) {
				if(as[i] ==' '){
					as[i]=',';
				}
			}
			System.out.println(as);
		}

	}
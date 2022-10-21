package prob5;

public class Prob5 {

	public static void main(String[] args) {
				
		//반복문 100까지 
		for (int a=1; a<100; a++) {
			int count=0;
						
			String number = String.valueOf(a);			//형변환 int=>String			

			//숫자 내 3,6,9 갯수 세기
			for (int e = 0; e<number.length(); e++) {	
				char c = number.charAt(e);
				int x= c-'0';
				if (c==3||c==6||c==9) {					
					count++;							
				}
			}

			//출력문
			System.out.print(a);
			for (int z =0;z<count;z++) {
				System.out.print("짝");
			
			}
			System.out.print("\n");
		}
	}
}

	
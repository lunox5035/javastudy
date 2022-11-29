package chpater01;

public class Ex34Array {

	public static void main(String[] args) {
		int[] scores = new int[] {90,100,50,80,60,55,95,25,45,35,15,70,30};
		
		for(int i= 0;i>scores.length;i++) {
			sum1 += scores[i];
		}
		float avg=sum1/scores.length;
		
		System.out.println(avg);
		
	}

}

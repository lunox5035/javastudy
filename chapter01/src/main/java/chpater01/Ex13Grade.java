package chpater01;

public class Ex13Grade {

	public static void main(String[] args) {
		char grade=' ';
		int score =75;
				
		if(score >=90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.println("학점은"+grade+"입니다.");
		
	}

}

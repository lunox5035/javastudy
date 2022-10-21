package chpater01;

public class Ex17Switch {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch (grade) {
			case 'A': 
			case 'B':{
				System.out.println( "참 잘어요");
				break;
			}
			case 'C': 
			case 'D':{
				System.out.println("좀 더 노력하세요");
				break;
			}
			case 'F':{
				System.out.println( "재수강합니다;");
				break;
		}
		default:
			System.out.println( "잘못 된 학점입니다.;");
		}

	}

}

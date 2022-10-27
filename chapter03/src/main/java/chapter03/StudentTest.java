package chapter03;

public class StudentTest {
	public static void main(String arge) {
		Student s1=new Student();
		s1.setGrade(1);				
				
		Person p1=s1;						//업캐스팅
		p1.setName("둘리");
		
		Student s2 =(Student)p1;			//다운캐스팅
		s2.setMajor("Computer Science");
		
	}
	
}

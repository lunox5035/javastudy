package chapter03;

public class Student extends Person {
	private String major;
	private int grade;

	public Student() {
		//자식의 모든 생성자에서 부모의 특정 생성자를 명시적(explicity)하지 않으면
		//암시적(implicity)으로 부모의 기본 생성자가 자식 생성자 코드 앞에 호출 된다.
		super();									
		System.out.println("Stdent() called");		//부모가 자식보다 먼저
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
package prob04;

public class Depart extends Employee {
	private String depertment;
	
	public String getDepertment() {
		return depertment;
	}

	public void setDepertment(String depertment) {
		this.depertment = depertment;
	}

	
	
	public Depart(String name,int salary, String depertment) {
		super(name,salary);
		this.depertment=depertment;
	}
	
	
	
	
	
	public void getInformation() {
		System.out.println( "이름:" + getName() + "연봉:" + getSalary() +"부서:"+depertment);
	}
	
}

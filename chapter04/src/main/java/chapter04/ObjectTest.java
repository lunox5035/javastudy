package chapter04;

public class ObjectTest {

	public static void main(String[] args) {
		Point p=new Point(10,20);
		
//		Class Kclass=p.getClass();
//		System.out.println(Kclass);
		
		System.out.println(p.getClass());//reflection 
		
		System.out.println(p.hashCode());//객체의 아이디 address기반 해싱값
										// daaress x/refernce x
		System.out.println(p.toString());//getClass()+"@"+hashCode()
		System.out.println(p);
		
		
	}

}

package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1=new Point(10,20);
		Point p2=new Point(10,20);
		Point p3=p2;
		
		//==:두 갹체의 동일성
		System.out.println(p1==p2);
		System.out.println(p3==p2);
		
		//equals:두객체의 동질성(내용비교)
		//		부모클래스 object의 기본 구현은 동일성비교(==)와 같다.
		//
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
		
	}

}

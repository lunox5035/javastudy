package chpater01;

public class Ex03Typecast {
	
	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 100L;
		//명시적(explicit) 캐스팅(casting)
		
		
		float f1 = 3.14f;
		double d1 = 3.14;
		//물그릇
		// 면시적캐시팅
		int i2 = (int)l1;
		float f2 = (float)d1;
		int i3 = (int)f1;		
		
		//암시적 캐스팅
		long l2 = i1;
		double d2= f1;
		double d3= i1;
				
		// 데이터의 의미가 다르면 캐스팅 자체가 안됨
		//bool b = (boolen)d
		
		
	}

}

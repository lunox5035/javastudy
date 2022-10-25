package chapter03;

import mypackage.Goods2;

public class Goods2App {
	
	public static void main() {
		Goods2 g=new Goods2();
		
		//pu 접근제한이 없다.		
		g.name="camera";
		
		// Protected는 같은 패키지에서 접근이 가능하다.
		//더 중요한 것은 자식에서도 접근이 가능하다.
		//g.price=1000;
	
	}
}

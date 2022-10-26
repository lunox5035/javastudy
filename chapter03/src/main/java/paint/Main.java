package paint;

public class Main {
	
	public static void main(String[] args) {
	
		Point pt = new Point(10,50);
//		pt.setX(10);
//		pt.setY(50);
		
		drawPonint(pt);
//		pt.disappear();
		pt.show(false);
	}
	
	public static void drawPonint(Point pt) {
		pt.show();
	}
}

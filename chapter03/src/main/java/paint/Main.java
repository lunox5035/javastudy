package paint;

public class Main {
	
	public static void main(String[] args) {
	
		Point pt = new Point();
		pt.setX(10);
		pt.setY(50);
		
		drawPonint(pt);
	}
	
	public static void drawPonint(Point pt) {
		pt.show();
	}
}

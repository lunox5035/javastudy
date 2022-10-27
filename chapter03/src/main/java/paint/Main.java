	package paint;

public class Main {
	//====================================
	
	public static void main(String[] args) {
	
		Point pt1 = new Point(10,50);
//		pt.setX(10);
//		pt.setY(50);
//		drawPonint(pt1);
		draw(pt1);
//		pt1.disappear();
//		draw(pt2);

		pt1.show(false);

			
//		Point pt2= new ColorPoint();
//		pt2.setX(100);
//		pt2.setY(200);
//		((ColorPoint)pt2).setColor("red");

//		drawPonint(pt2);		
		
		Point pt2 = new ColorPoint(100,200,"red");
//		pt2.setX(100);
//		pt2.setY(200);
//		pt2.setColor("red");

//		drawColorPoint(pt2);
		
		draw(pt2);
		pt2.show(false);
		
		Triangle triangle =new Triangle();
//		drawShape(triangle);
		draw(triangle);
		
		Rectangle rectangle =new Rectangle();
//		drawShape(rectangle);
		draw(rectangle);
		
		Circel circel =new Circel();
//		drawShape(circel);
		draw(circel);
		
		GraphicText gt= new GraphicText("Hello World");
		draw(gt);
		
	}
	
public static void draw(Drawable drawable) {
	drawable.draw();
	}
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//
//	
//	public static void drawPonint(Point pt) {
//		pt.show();
//	}

//	public static void drawCorlorPoint(ColorPoint pt) {
//		pt.show();
//	}
	

//	public static void drawTrinagle(Triangle triangle) {
//		triangle.draw();

//	public static void drawShape(Shape shape) {
//		shape.draw();
		
	}

	

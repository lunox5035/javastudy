package com.bitacdemy.paint.main;

import com.bitacdemy.paint.i.Drawable;
import com.bitacdemy.paint.point.ColorPoint;
import com.bitacdemy.paint.point.Point;
import com.bitacdemy.paint.shape.Circel;
import com.bitacdemy.paint.shape.Rectangle;
import com.bitacdemy.paint.shape.Shape;
import com.bitacdemy.paint.shape.Triangle;
import com.bitacdemy.paint.text.GraphicText;

	
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
		//instanceof test
		System.out.println(circel instanceof Object);
		System.out.println(circel instanceof Shape);
		System.out.println(circel instanceof Circel);
		//오류 : 클래스는 hierachy 상위와 하위만 instanceof연산자를 사용할 수 있다. 부모자식만 확인가능
		//∴동위이니깐 false
		//System.out.println(circel instanceof Readable);
//		Object o= circel;
//		System.out.println(o instanceof String);
		
		//하지만 인터페이스는 hierachy와 상관없이 instanceof연산자를 사용할 수 있다.
		System.out.println(circel instanceof Drawable);
		System.out.println(circel instanceof Runnable);//남이니깐 false
		
		
		
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

	

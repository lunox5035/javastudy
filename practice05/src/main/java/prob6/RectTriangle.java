package prob6;

public class RectTriangle extends Shape {
	private double height;
	private double width;

	public RectTriangle(int i, int j) {
		this.width=i;
		this.height=j;
	}

	@Override
	public double getPerimeter() {

		return width + height + Math.sqrt((width * width) + (height * height));

	}

	@Override
	public double getArea() {

		return width * height * 0.5;

	}

//
//public void name(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//
//	public RectTriangle(int i, int j) {
//		i=height;
//		j=width;
//	}
//	
////	private static void Perimeter(int width,int height) {
////		double result = width + height +Math.sqrt(Math.pow(width, 2)+(height*height));
////		return ;
//				
//	}
//	private static void Area() {
//		
//	}
}

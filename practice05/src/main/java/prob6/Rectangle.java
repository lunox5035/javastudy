package prob6;

public class Rectangle extends Shape implements Resizable {

	private double height;
	private double width;
	private double Resizable;
	
	public Rectangle(int i, int j) {
		this.width=i;
		this.height=j;
	}

	@Override
	public double getPerimeter() {

		return (width + height) *2;
	}

	@Override
	public double getArea() {

		return width * height;
	}

	@Override
	public void resize(double d) {
		width = width * d;
		height = height * d;
		
	}

	

//	private int height;
//	private int width;
//	private String[] list;
//
//	public void name(int width, int height) {
//		this.width = width;
//		this.height = height;
//
//		for (String s : list) {
//			System.out.println(s);
//		}
//	}

}

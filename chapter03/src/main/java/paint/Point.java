package paint;

public class Point {
	private int x;
	public int getX() {
		return x;
		
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	private int y;
	
	public void show() {
		System.out.println("점(x="+x+", y="+y+"_를 그렸습니다.");
	}
	
	
	
	
}

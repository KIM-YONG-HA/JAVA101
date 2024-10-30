package d1030test;

public class Point {

	private int x, y;

	public Point() {
		this.x=0;
		this.y=0;
	}
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	

	

	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

}

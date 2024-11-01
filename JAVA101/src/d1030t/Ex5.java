package d1030t;

public class Ex5 {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(10, 10, "RED");
		
        cp.setXY(20,20);
		cp.setColor("blue");
		System.out.println(cp);
		

	}

}

class Point {
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	public int getX() {
		return x; 
		}
	public int getY() {
		return y; 
		}
	
	protected void move(int x, int y) {
		this.x = x; this.y = y;
		
	}
	
}

class ColorPoint extends Point {
	
	String color;
	
	public ColorPoint() {
		this(0,0,"RED");
	}
	
	public ColorPoint(int x, int y) {
		this(x,y,"RED");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		move(x, y);
	}
	
	void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color + "색의 (" + getX()+"," + getY()+")의 점";
	}
	
	
	
	
}



package d1030test;

public class ColorPoint extends Point {

	String color;
	
	public ColorPoint() {
		this.color = "BLACK";
		
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		
	}
	

	
	public void setXY(int x, int y) {
		
		this.move(x, y);
		
	}
	

	public void setColor(String color) {
		this.color = color;
	}


	

	
	
	
	
	public String toString() {
		
		return color + "색의 (" + this.getX() + ", " + this.getY() +")의 점";
		
	}
	
	
	
	

//	
//	public String toString() {
//		return "(" + this.getX() + "," + this.getY() + ") 위치의 "+color+"색 점 ";
//	}
//
//	

	
	

}

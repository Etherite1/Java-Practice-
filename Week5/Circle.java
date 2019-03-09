package class5;

public class Circle {
	private int cx, cy; // private variable for center
	private int r; // private variable for radius
	private String name;
	
	public Circle() {
		cx = 0;
		cy = 0;
		r = 1;
		name = "Default";
		
	}
	
	public Circle(int x) {
		cx = cy = 0;
		this.r = r;
		name = "Default";
		
	}
	
	public Circle(int x, String n) {
		cx = cy = 0;
		this.r = r;
		this.name = name;
	}
	
	public Circle(int r, String n, int x, int y) {
		cx = x;
		cy = y;
	}
	
	public void setCenter(int x, int y) {
		this.cx = x;
		this.cy = y;
	}	
	
	public int getCenter() {
		return cy;
	}
	
	public void setRadius(int x) {
		this.r = x;	
	}
	
	public double getRadius() {
		return r;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * r;
	}
	
	public double getArea() {
		return Math.PI * r * r;
	}
	
	public boolean isInside(int x, int y) {
		double check = Math.sqrt((x - cx) * (x - cx) + (y - cy) * (y - cy));
		if(check < r) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void speak() {
		System.out.println("I am round");
		System.out.println("My name is " + name + ".");
		System.out.println("My radius is " + r + ".");
		System.out.println("My center is (" + cx + "," + cy + ").");
	}

	
}


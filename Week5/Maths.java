package class5;

public class Maths {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		circle1.speak();
		
		circle1.setRadius(12);
		System.out.println(circle1.getRadius());
		
		circle1.setCenter(2, 2);
		circle1.setName("Big Circle");
		System.out.println("Perimeter of the circle is: " + circle1.getPerimeter());
		System.out.println("Area of the circle is: " + circle1.getArea());
		
		System.out.println("Is (3,4) inside the circle? " + circle1.isInside(3, 4));
	}

}

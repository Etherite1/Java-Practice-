package class5;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new animal ?
		Animal lion = new Animal(4, 400, "M");
		lion.eat();
		lion.sleep();
		lion.speak();
	
		// what about a new bird class ?
		// and fish ?
		bird sparrow = new bird(1, 5, "M");
		sparrow.fly();
		sparrow.speak();
		sparrow.eat();
		sparrow.sleep();
		
		fish goldfish = new fish(1, 3, "M");
		goldfish.speak();
		goldfish.swim();
		goldfish.eat();
		goldfish.sleep();
		// inheritance extends
		
		// What about a sparrow and a penguin classes ?
		sparrow hi = new sparrow(1, 3, "M");
		hi.speak();
		
		penguin bye = new penguin(3, 7, "F");
		bye.speak();
		bye.fly();
		// Can penguin fly though ?
				
		// overwriting
				
		// better method - interface:
		// abstract methods, "implements"
				
		// interfaces are contracts
				
		// CAN ONLY HAVE ONE PARENT CLASS
		// As many interfaces as wanted
				
		// Polymorphism
		// 
	}}



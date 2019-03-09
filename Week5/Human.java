package class5;

public class Human {
	// name, age, heightInInches, eyeColor
	String name;
	int age;
	int heightInInches;
	String eyeColor;
	String hairColor;
	
	// Constructor
	public Human(String name, int age, int heightInInches, String eyeColor, String hairColor) {
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColor = eyeColor;
		this.hairColor = hairColor;
		
	}
	
	// speak, eat, walk, work
	public void speak() {
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old.");
		System.out.println("My eyes are " + eyeColor + '.');
		System.out.println("I am " + heightInInches + " inches tall.");
		System.out.println("My hair color is " + hairColor + '.');
		
	}
	public void eat() {
		System.out.println("Eating...");
	}
	public void walk() {
		System.out.println("Walking...");
	}
	public void work() {
		System.out.println("Working...");
	}
}

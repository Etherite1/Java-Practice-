package class5;

public class Animal {
	
	// age, weightInLbs, gender
	private int age;
	private int weightInLbs;
	private String gender;
	
	// constructor w/ parameters
	public Animal (int age, int weightInLbs, String gender) {
		this.age = age;
		this.weightInLbs = weightInLbs;
		this.gender = gender;
}

	// eat, sleep?
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}

	public void speak() {
		System.out.println("I am " + age + " years old.");
		System.out.println("I weigh " + weightInLbs + " pounds.");
		System.out.println("I am a " + gender + '.');
}}	




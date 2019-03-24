package class5;

public class bird extends Animal implements birds {

		public bird(int age, int weightInLbs, String gender) {
		super(age, weightInLbs, gender);
		// TODO Auto-generated constructor stub
	}

		public void speak() {
			System.out.println("I am a bird...");
		}
		
		public void fly() {
			System.out.println("I am flying...");
		}

	}


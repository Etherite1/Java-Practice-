package class5;
import java.util.Scanner;

public class whileLoopExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// Print all the divisors of n, here n is taken as input from user
		System.out.print("What number do you want to find the divisors of? ");
		int input = scan.nextInt();
		int i = 1;
		
		while(i <= input) {
			if (input % i == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}

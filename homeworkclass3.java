package class3;
import java.util.Random;
import java.util.Scanner;


public class homeworkclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  
		   Write a program that generates a random number and asks the user to guess what the number is. 
		   If the user's guess is higher than the random number, the program should display "Too high, 
		   try again." If the user's guess is lower than the random number, the program should display 
		   "Too low, try again." The program should use a loop that repeats until the user correctly 
		   guesses the random number.
		  
		 */
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int number = rand.nextInt(100); // generates random number
		int guesses = 0;
		for(;;) {
			System.out.print("I am thinking of a number from 1 to 100! Can you guess the number? ");
			System.out.print("Guess: ");
			int userGuess = scan.nextInt();
			if(userGuess == number){ // if the user guesses the number correctly
				guesses++;
				System.out.println("Congratulations! That is the number!");
				System.out.println("It took you " + guesses + " guesses!");
				break;
			}
			else if(userGuess < number) { // if the user's guess is too small
				System.out.println("Sorry, that number is smaller than my number.");
				guesses++;
			}
			else if(userGuess > number) {
				System.out.println("Sorry, that number is larger than my number."); // if the user's guess is too large
				guesses++;
			}
	}
}}

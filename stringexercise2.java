package class4;
import java.util.Scanner;

public class stringexercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read a string from the keyboard, and print out a new string where every char in the original is duplicated
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the thing you want to double? ");
		String input = scan.nextLine();
		String doubled = "";
		for(int i = 0; i <= input.length() - 1; i++) {
			doubled = doubled + input.charAt(i) + input.charAt(i);
		}
		System.out.println(doubled);
	}

}

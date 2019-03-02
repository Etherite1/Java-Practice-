package class4;
import java.util.Scanner;

public class stringexercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// read a complete name (first and last name with space separating)
		// print the first and last names explicitly.
		// For Example: "John Smith" will produce the output:
		//Firstname: John
		//Lastname: Smith
		Scanner scan = new Scanner(System.in);
		System.out.print("Please print your first and last name separated by a space: ");
		String name = scan.nextLine();
		String firstname = name.substring(0, name.indexOf(" "));
		String lastname = name.substring(name.indexOf(" ") + 1);
		System.out.println("Firstname: " + firstname);
		System.out.println("Lastname: " + lastname);
		
		
	}

}

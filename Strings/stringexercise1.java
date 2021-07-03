package class4;
import java.util.Scanner;

public class stringexercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print reversed version of the input string
		Scanner scan = new Scanner(System.in);
		System.out.print("What is the thing you want to print backwards? ");
		String input = scan.nextLine();
		String backwards = "";
		for(int i = input.length() - 1; i >= 0; i--) {
			backwards = backwards + input.charAt(i);
		}
		System.out.println(backwards);
	}

}

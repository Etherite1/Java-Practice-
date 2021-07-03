package class4;
import java.util.Scanner;

public class stringexercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//give two strings, return their concatenation, but the first characters are dropped.
		//for example: "Hello" and "World" returns "elloorld"
		Scanner scan = new Scanner(System.in);
		System.out.println("What two items would you wish to concatenate?");
		System.out.print("Word 1: ");
		String word1 = scan.nextLine();
		System.out.print("Word 2: ");
		String word2 = scan.nextLine();
		word1 = word1.substring(1, word1.length());
		word2 = word2.substring(1, word2.length());
		String resultword = word1 + word2;
		System.out.println(resultword);
				
		
	}

}

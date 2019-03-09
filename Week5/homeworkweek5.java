package homework;
import java.util.Scanner;
public class homeworkweek5 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("What number do you want to check is palindromic? ");
		String input = scan.nextLine();
		String bkwd = "";
		String rev = input;
		int y = input.length() - 1;
			while(y >= 0) 
			{
				bkwd += input.charAt(y);
				y--;
			}
			if(bkwd.equals(input))
			{
				System.out.println("This number is palindromic!");
			}
			else 
			{
				rev = rev + bkwd;
				String bkwd2 = "";
				int i = rev.length() - 1;
				while(i >= rev.length() / 2) 
				{
					bkwd2 += rev.charAt(i);
					i--;
				}
				if(rev.substring(0, rev.length() / 2).equals(bkwd2))
				{
					System.out.println("After adding the reversed version to itself, the number is now palindromic!");
					System.out.println("The new version is: " + rev);
				}
			}
	}
}

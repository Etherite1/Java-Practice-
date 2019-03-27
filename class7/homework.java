
import java.util.Scanner;

public class homework 
{
  public static String repeat(String x, int y)
  {
    String str = "";
    for(int i = 0; i < y; i++)
    {
      str += x;
    }
    return str;
  }

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("What word do you want your pattern to be displayed? ");
    String input = scan.nextLine();
    System.out.println(input);
    String ChStr = input;
    ChStr = ChStr.substring(1, ChStr.length()) + ChStr.charAt(0);
    System.out.println(" " + ChStr);
    while(ChStr.equals(input) != true)
    {
      for(int i = 2; i <= input.length(); i++)
      {
      String spaces = repeat(" ", i);
      ChStr = ChStr.substring(1, ChStr.length()) + ChStr.charAt(0);
      System.out.println(spaces + ChStr);
      }
    }
  }
}
		//Get a word of input from user and print the pattern as in example below.
		//Ex:
		//word: bedir,
		//pattern:
		//bedir
		// edirb
		//  dirbe
		//   irbed
		//    rbedi
		//     bedir
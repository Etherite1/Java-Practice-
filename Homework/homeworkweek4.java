package class4;
import java.util.Scanner;

public class homeworkweek4 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("What do you want to encrypt? ");
    String input = scan.nextLine();
    String ret = "";
    for(int i = 0; i <= input.length() - 1; i++){
      switch(input.charAt(i)) {
        case 'a':
          ret = ret + 'e';
          break;
        case 'e':
        	ret = ret + 'i';
          break;
        case 'i':
        	ret = ret + 'o';
          break;
        case 'o':
        	ret = ret + 'u';
          break;
        case 'u':
        	ret = ret + 'a';
          break;
        case 'A':
        	ret = ret + 'E';
          break;
        case 'E':
        	ret = ret + 'I';
          break;
        case 'I':
        	ret = ret + 'O';
          break;
        case 'O':
        	ret = ret + 'U';
          break;
        case 'U':
        	ret = ret + 'A';
          break;
        default:
        	ret = ret + input.charAt(i);
           
         
      }}
     System.out.println("Your encrypted message is " + ret + "!");
  
  
 }
}





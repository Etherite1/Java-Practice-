package class5;

import java.util.Scanner;

	public class BinaryToDecimal {
		public static void toBin(int input) {
	    	int dec = 0;
	    	int i = 0;
	
	        while(input != 0) {
	            dec += (input % 10) * Math.pow(2, i);
	            i++;
	            input /= 10;
	        }
	    System.out.println(dec);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the binary to convert to decimal: ");
		int a = scan.nextInt();
		scan.close();
		toBin(a);
	}
	
	}
	


package class5;

import java.util.Scanner;

public class OctalToDecimal {
	
	public static void toOctal(int input) {
        	int dec = 0;
        	int i = 0;

            while(input != 0) {
                dec += (input % 10) * Math.pow(8, i);
                i++;
                input /= 10;
            }
        System.out.println(dec);
    }
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the octal to convert to decimal: ");
		int a = scan.nextInt();
		scan.close();
		toOctal(a);
	}
}

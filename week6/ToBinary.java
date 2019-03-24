package class5;

import java.util.Scanner;
import java.lang.Math;

public class ToBinary {
	
	public static void toBinary(int x) {
		String str = "";
		while(x > 0) {
			str = x % 2 + str;
			x /= 2;
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number to convert to binary: ");
		int a = scan.nextInt();
		scan.close();
		
		toBinary(a);
	}

}

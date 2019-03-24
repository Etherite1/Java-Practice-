package class5;

import java.util.Scanner;

public class ToHex {

	public static void toHex(int x) {
		String str = "";
		int remainder = 0;
		int divisible = x / 16;
		String remainder1 = "";
		if(x % 16 < 10) {
			remainder = x % 16;
		}
		else if(x % 16 == 10) {
			remainder1 = "A";
		}
		else if(x % 16 == 11) {
			remainder1 = "B";
		}
		else if(x % 16 == 12) {
			remainder1 = "C";
		}
		else if(x % 16 == 13) {
			remainder1 = "D";
		}
		else if(x % 16 == 14) {
			remainder1 = "E";
		}
		else if(x % 16 == 15) {
			remainder1 = "F";
		}
		str = str + divisible + remainder + remainder1;
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number to convert to hexadecimal: ");
		int a = scan.nextInt();
		scan.close();
		toHex(a);
	}

}

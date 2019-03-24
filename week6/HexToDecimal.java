package class5;

import java.util.Scanner;

public class HexToDecimal {
	
	public static void toDec(String input) {
		int ans = 0;
		String digits = "0123456789ABCDEF";
		input = input.toUpperCase();
		for(int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			int b = digits.indexOf(a);
			ans = 16 * ans + b;
		}
		System.out.println(ans);
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("What hex do you want to convert to decimal? ");
		String a = scan.nextLine();
		toDec(a);

}}

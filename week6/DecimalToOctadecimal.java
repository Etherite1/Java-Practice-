package class5;

import java.util.Scanner;

public class DecimalToOctadecimal {
	
	public static void toOctal(int x){
		int octa = 0;
    	int i = 1;

        while(x != 0) {
            octa += (x % 8) * i;
            x /= 8;
            i *= 10;
        }
        System.out.println(octa);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number to convert to octadecimal: ");
		int a = scan.nextInt();
		scan.close();
		toOctal(a);
	}

}

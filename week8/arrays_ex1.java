package class8;

import java.util.Scanner;
import java.lang.Math;

public class arrays_ex1 {

	public static void main(String[] args) {
		// get n numbers from user and print n lines
		// that each has the difference of the current 
		// value from the sum of all the numbers
		
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to enter? ");
		int n = scan.nextInt();
		int[] ia = new int[n];
		for(int i = 0; i < n; i++) 
		{
			System.out.print("Input a number: ");
			ia[i] = scan.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < ia.length; i++)
		{
			sum += ia[i];
		}
		for(int i = 0; i < ia.length; i++)
		{
			System.out.println(Math.abs(sum - ia[i]));
		}
		
		

	}

}

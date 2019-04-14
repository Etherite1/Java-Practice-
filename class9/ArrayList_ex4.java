package class9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_ex4 {
	public static double stdev(ArrayList<Integer> a)
	{
		double mean = 0;
		double sqmean = 0;
		for(int i = 0; i < a.size(); i++)
		{
			mean += a.get(i);
		}
		mean /= a.size();
		for(int i = 0; i < a.size(); i++)
		{
			sqmean += Math.pow(a.get(i) - mean, 2);
		}
		sqmean /= a.size();
		return Math.sqrt(sqmean);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Type stop to stop.");
		System.out.print("Give me a number: ");
		int c = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		while(in.hasNextInt()) {
			System.out.print("Give me a number: ");
			int a = in.nextInt();
			arr.add(a);
			if(a > b)
			{
				b = a;
			}
			else if(a < 0 )
			{
				
			}
			if(a < c)
			{
				c = a;
			}
			
		}
		System.out.println("Max is: " + b);
		System.out.println("Min is: " + c);
		System.out.println("Standard Deviation is: " + stdev(arr));
		
	}

}

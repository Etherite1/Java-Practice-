package class8;

import java.util.Scanner;
import java.lang.Math;

public class arrays_ex2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] ar = new int[n];
		
		int sum = 0;
		
		for(int i = 0; i < n; i++)
		{
			ar[i] = sc.nextInt();
			sum += ar[i];
			double mean = sum/(i+1);
			double res = 0;
			for(int j = 0; j <= i; j++)
			{
				res += (ar[j] - mean) * (ar[j] - mean);
			}
			System.out.println(Math.sqrt(res / (i + 1)));
		}
	}
}
	

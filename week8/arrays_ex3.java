package class8;

import java.util.Scanner;

public class arrays_ex3 {

	public static void main(String[] args) {
		// get 5 strings from user
		// print out all the possible combinations with the given strings
		Scanner scan = new Scanner(System.in);
		String inputs[] = new String[5];
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Give me a word: ");
			inputs[i] = scan.nextLine();
		}
		String str = "";
		for(int a = 0; a < 5; a++)
		{
			
			for(int b = 0; b < 5; b++) 
			{
				if(a == b) continue;
				for(int c = 0; c < 5; c++)
				{
					if(a == c||b == c) continue;
					for(int d = 0; d < 5; d++)
					{
						if(a == d||b == d || c == d ) continue;
						for(int e = 0; e < 5; e++)
						{
							if(a == e||b == e || c == e || d == e) continue;
							System.out.println(inputs[a] + " " + inputs[b] + " " + inputs[c] + " " + inputs[d] + " " + inputs[e]);
						}
					}
				}		
			}
		}
	}

}


public class Arrays {

	public static void main(String[] args) 
	{
		// Arrays are one of the most popular data structures we have in Java. It is an ordered list that 
		// we keep track of the data we have.
		
		int[] nums = new int[6];
		int[] nums2 = {2017, 7, 5, 9, 30 };
		
		for(int i = 0; i < nums2.length; i++) 
		{
			System.out.printf("%d\n", nums2[i]);
		}
//create array of doubles
		
		double[] doubles = new double[6];
		
		double[] doubles2 = { 5.0, 7.0, 3.0, 1.0, 9.0, 11.0 };
		for(int i = 0; i < doubles2.length; i++)
		{
			System.out.println(doubles2[i]);
		}

//create 2d array and print
		int[][] name =
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};	
		for(int i = 0; i < name.length; i++) 
		{
			for(int j = 0; j < name[i].length;j++)
			{
				System.out.println(name[i][j]);
			}
		}

		
	int[][] name2 = {
			{1,2,3, 4},
			{5,6,7, 8},
			{9, 10, 11, 12}
	};
	
	System.out.println("-------");
	System.out.println(name2[1][3]);
	System.out.println(name2[2][1]);
	System.out.println("-------");
	
	for(int i = 0; i < name.length; i++) 
	{
		for(int j = 0; j < name2[i].length;j++)
		{
			System.out.println(name2[i][j]);
		}
	}

}
}

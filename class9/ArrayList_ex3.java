package class9;

import java.util.ArrayList;

public class ArrayList_ex3 {
	
	public static void deleteEven(ArrayList<Integer> a)
	{
		for(int i = 0; i < a.size(); i++)
		{
			if(a.get(i) % 2 == 0)
			{
				a.remove(i);
				i--;
			}
		}
	}


	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);

		System.out.println(arr); //output: [1,2,3,4,5]
		deleteEven(arr);
		System.out.println(arr); // output: [1,3,5]
	}
	

}

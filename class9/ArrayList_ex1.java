package class9;

import java.util.ArrayList;

public class ArrayList_ex1 {

	public static void main(String[] args) {
		// Create  a String array list, and add 2 letters in it
		// remove all the elements
		// add two new letters and print the list
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("a");
		arr.add("b");
		arr.clear();
		arr.add("c");
		arr.add("d");
		System.out.println(arr);
	}
}

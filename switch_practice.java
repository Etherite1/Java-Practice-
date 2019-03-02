package class4;
import java.util.Scanner;

public class switch_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many sides does your polygon have?");
		int sides = scan.nextInt();
		switch(sides) {
		case 3:
			System.out.println("Your polygon is a triangle!");
			break;
		case 4:
			System.out.println("Your polygon is a square!");
			break;
		case 5:
			System.out.println("Your polygon is a pentagon!");
			break;
		case 6:
			System.out.println("Your polygon is a hexagon!");
			break;
		case 7:
			System.out.println("Your polygon is a septagon!");
			break;
		case 8:
			System.out.println("Your polygon is an octagon!");
			break;
		case 9:
			System.out.println("Your polygon is a nonagon!");
			break;
		case 10:
			System.out.println("Your polygon is a decagon!");
			break;
		default:
			System.out.println("Your polygon has less than 3 or more than 10 sides!");

			



	}

}}

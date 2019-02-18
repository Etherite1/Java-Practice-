package class3;

public class forloopexercises3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// find and print squares of odd numbers from 1 to 15
		
		for(int i = 1; i <= 15; i = i + 2) {
			System.out.println(i * i);
		}
		
		// find and print 10 factorial
		int fact = 1;
		for(int i = 10; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);
		
		// find and print 13 factorial
		
		long fact2 = 1;
		for(int i = 13; i >= 1; i--) {
			fact2 = fact2 * i;
		}
		System.out.println(fact2);
	}
	

}

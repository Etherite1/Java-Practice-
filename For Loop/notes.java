package class3;

public class notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i = i+1) {
			System.out.println(i);
	}
		for(int i = 1; i <= Integer.MAX_VALUE/2; i = i * 2) {
			System.out.println(i);
	}
		//finding 2 ^ 63 - print all the powers of 2, beginning from 1 to 63
		long res = 2;
		for(int i = 1; i <= 63; i++) {
			System.out.println("2^" + i + " is " + res);
			res = res * 2;
}}}

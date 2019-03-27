
public class NestedLoops_ex4 {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i++) {
			for(int j = 7; j > 7 - i; j--) {
				System.out.print(" ");
			}
			for(int j = 11; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j < 3 + i * 2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

package class3;
import java.math.BigInteger;

public class forloopexercises4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1;
		int num2 = 1;
		for(int i = 2; i <= 20; i ++) {
			num1 = num2 + num1;
			num2 = num2 + num1;
		}
		System.out.println(num2);
		
		//challenge - 100th term - java.math.BigInteger
	}

}

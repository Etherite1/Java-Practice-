import java.util.ArrayList;
import java.util.Scanner;

public class Homeworkweek9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] lines = new int[n][];
		for(int i = 0; i < n; i++)
		{
			int d = scan.nextInt();
			int[] aline = new int[d];
			for(int a = 0; a < d; a++)
			{
				aline[a] = scan.nextInt();
			}
			lines[i] = (aline);
		}
		int q = scan.nextInt();
		for(int i = -1; i < q; i++)
		{
			int x = scan.nextInt() - 1;
			int y = scan.nextInt() - 1;
			if(x > lines.length || y > lines[x].length)
			{
				System.out.println("ERROR");
			}
			else
			{
				System.out.println(lines[x][y]);
			}
		}

	}

}

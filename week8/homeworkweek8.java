package class8;

import java.util.Scanner;

public class homeworkweek8 {
    
    static int solve(int a, int b, int n)
    {
        int value = a;
        for(int i = 0; i < n; i++)
        {
            value = value + ((int) Math.pow(2, i)) * b;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int a = 0;
        int b = 0;
        int n = 0;
        int k = 0;
        String[] stringarray = new String[q];
        for(int i = 0; i < q; i++)
        {
            a = scan.nextInt();
            b = scan.nextInt();
            n = scan.nextInt();
            String str = "";
            for(int j = 1; j < n + 1; j++) 
            {
                str += solve(a, b, j) + " ";
            }
            stringarray[k] = str;
            k += 1;
        }
        for(int i = 0; i < q; i++)
        {
            System.out.println(stringarray[i]);
        }
    }
}

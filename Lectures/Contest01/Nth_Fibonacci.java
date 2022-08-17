package Contest01;

import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int i = 1;
        while(i <= n) {
            int c = a + b;
            a = b;
            b = c;

            i++;
        }

        System.out.println(a);
    }
}

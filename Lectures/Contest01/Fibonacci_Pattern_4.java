package Contest01;

import java.util.Scanner;
/*
0
1    1
2    3     5
8   13    21    34

Each number is separated from other by a tab.
For given input n, You need to print n(n+1)/2 fibonacci numbers.
Kth row contains , next k fibonacci numbers.
 */
public class Fibonacci_Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int a = 0;
        int b = 1;

        while (row <= n){
            //num
            for (int i = 1; i <= numCount; i++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b = c;
            }

            //Next Steps
            row++;
            System.out.println();
            numCount++;
        }
    }
}

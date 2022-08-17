package Contest01;

import java.util.Scanner;

public class Boston_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BostonNumber(n);
    }

    public static void BostonNumber(int n) {
        int x = n;
        int sum = 0;
        int i = 2;
        while (i <= n) {
            while (n % i == 0) {
                sum = sum + sod(i);
                n = n / i;
            }
            i++;
        }

        //Sum of digits of the input number
        int ans = sod(x);

        if(ans == sum) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static int sod(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}

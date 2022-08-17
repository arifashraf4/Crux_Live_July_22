package Contest01;

import java.util.Scanner;
/*
Formula LCM:
(n1 * n2)/GCD

Formula GCD:
until dividend % divisor != 0 perform calculation:
    divisor = dividend
    dividend = rem
 */
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();
        int dividend = sc.nextInt();
        if(divisor > dividend) {
            int a = divisor;
            divisor = dividend;
            dividend = a;

        }
        int n1 = divisor;
        int n2 = dividend;

        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            divisor = dividend;
            dividend = rem;
        }
        int lcm = (n1 * n2)/divisor;
        System.out.println(lcm);
    }
}

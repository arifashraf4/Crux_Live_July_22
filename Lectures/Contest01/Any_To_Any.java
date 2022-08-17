package Contest01;

import java.util.Scanner;
/*
Binary -> Octal
Binary -> Decimal
Octal -> Binary
Octal -> Decimal
Decimal -> Binary
Decimal -> Octal
Base 3 -> Base 4 (Etc)
*/
public class Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int sum1 = 0;
        int mul1 = 1;
        //converts into decimal
        while (n > 0) {
            int rem = n % 10;
            sum1 = sum1 + rem * mul1;
            mul1 = mul1 * source;
            n = n / 10;
        }

        //converts decimal into dest
        if(n == 0) {
            int n2 = sum1;
            int sum2 = 0;
            int mul2 = 1;
            while (n2 > 0) {
                int rem = n2 % dest;
                sum2 = sum2 + rem * mul2;
                mul2 = mul2 * 10;
                n2 = n2 / dest;
            }

            System.out.println(sum2);
        }
    }
}

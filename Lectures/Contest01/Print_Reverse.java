package Contest01;

import java.util.Scanner;

public class Print_Reverse {
    /*Reverse a number
    Ex: n = 1234
    output: 4321

    Logic:
    n = 1234
    until n != 0 store the last digit of the number
    store the new number as n by: n = n / 10
    Store reversed number by: digit = digit * 10 + rem

    */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit = 0;

        while(n != 0) {
            int rem = n % 10;
            n = n / 10;
            digit = digit * 10 + rem;
        }
        System.out.println(digit);
    }
}

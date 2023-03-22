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

    //If the integer is a very large value we return 0
    public static int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            int pop = x % 10;
            x /= 10;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)){
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }

}

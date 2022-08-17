package Contest01;

import java.util.Scanner;
/*
Order of count: Right to Left
Example: n = 2645
Output:
11          Explanation: (5 + 6) Odd Placed Digits
6           Explanation: (4 + 2) Even Placed Digits

5 is present at 1st position, 3 is present at 2nd position,
6 is present at 3rd position and 2 is present at 4th position.

Sum of odd placed digits on first line.
5 and 6 are placed at odd position.
Hence odd place sum is 5+6=11

Sum of even placed digits on second line.
3 and 2 are placed at even position.
Hence even place sum is 3+2=5
 */
public class Sum_Of_Even_Odd_Placed_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int odd = 0;
        int even = 0;

        while (n != 0) {
            int digit = n % 10;
            if(count % 2 != 0) {
                n = n / 10;
                odd = odd + digit;
            } else {
                n = n / 10;
                even = even + digit;
            }
            count++;
        }
        System.out.println(odd);
        System.out.println(even);
    }
}

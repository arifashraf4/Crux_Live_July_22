package Lec02;

import java.util.Scanner;
/*Pattern:
 * * * * *
     * * * *
         * * *
             * *
                 *
 */
public class Pattern_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 0;
        int stars = n;

        while(row <= n){
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= stars) {
                System.out.print("* ");
                j++;
            }

            row++;
            System.out.println();
            space += 2;
            stars--;

        }
    }
}

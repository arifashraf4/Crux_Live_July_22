package Lec02;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        /*
         *                       *
         *  *                 *  *
         *  *  *           *  *  *
         *  *  *  *     *  *  *  *
         *  *  *  *  *  *  *  *  *

         5 - rows

         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 2*n -1;
        int stars = 1;

        while(row <= n) {
            int i = 1;
            while (i <= stars) {
                System.out.print("* ");
                i++;
            }

            int j = 1;
            while(j <= space) {
                System.out.print("  ");
                j++;
            }

            int k = 1;
            while(k <= stars) {
                System.out.print("* ");
                k++;
            }

            //Next row Prep
            System.out.println();
            row++;
            stars++;
            space -= 2;
        }
    }
}

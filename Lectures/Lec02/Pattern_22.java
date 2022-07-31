package Lec02;

import java.util.Scanner;

public class Pattern_22 {

    /*
         *  *  *  *  *  *  *  *  *
         *  *  *  *     *  *  *  *
         *  *  *           *  *  *
         *  *                 *  *
         *                       *

         5 - rows

         */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = n;
        int space = 0;

        while(row <= n) {
            int i = 1;
            while(i <= stars) {
                System.out.print("* ");
                i++;
            }

            int j = 1;
            while(j <= space) {
                if(row == 2) {
                    space--;
                }
                System.out.print("  ");
                j++;
            }

            int k = 1;
            while(k <= stars) {
                if(k==n) {
                    break;
                } else {
                    System.out.print("* ");
                }
                k++;
            }

            //Next row prep
            row++;
            System.out.println();
            stars--;
            space += 2;
        }
    }
}

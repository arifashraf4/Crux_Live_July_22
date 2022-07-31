package Lec02;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int stars = 1;
        int excl = 0;

        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while (j <= 1) {
                System.out.print("  * ");
                j++;
            }

            int k = 1;
            while (k <= excl) {
                System.out.print("! * ");
                k++;
            }

            row++;
            System.out.println();
            space--;
            stars++;
            excl++;
        }
    }
}

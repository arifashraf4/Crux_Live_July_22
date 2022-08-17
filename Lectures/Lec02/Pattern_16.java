package Lec02;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = n;
        int space = n - 1;

        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= stars) {
                System.out.print("* ");
                j++;
            }

            //Mirroring
            if(row < n) {
                stars--;
                space--;
            } else {
                stars++;
                space++;
            }

            row++;
            System.out.println();
        }
    }
}

package Lec02;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = n - 1;
        int stars = 1;

        while(row <= 2*n -1) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            //star
            int j = 1;
            while (j <= stars) {
                System.out.print("* ");
                j++;
            }

            if(row < n) {
                space--;
                stars++;
            } else {
                space++;
                stars--;
            }

            row++;
            System.out.println();
        }
    }
}

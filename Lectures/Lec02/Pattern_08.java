package Lec02;

import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;

        while(row <=n) {
            //star
            int i = 1;
            while (i <= n) {
                if(i == row || row + i == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                i++;
            }

            row++;
            System.out.println();
        }
    }
}

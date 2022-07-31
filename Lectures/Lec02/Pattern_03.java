package Lec02;

import java.util.Scanner;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = 5;
        while(row <= n) {
            int i = 1;
            while(i <= stars) {
                System.out.print("* ");
                i++;
            }

            row++;
            System.out.println();
            stars--;
        }
    }
}

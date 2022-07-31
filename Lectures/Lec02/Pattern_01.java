package Lec02;

import java.util.Scanner;

public class Pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //First Approach:
        int row = 1;
        int stars = n;

        while(row <= n) {
            int col = 1;
            while(col <= stars) {
                System.out.print("* ");
                col++;
            }

            row++;
            System.out.println();
        }

        //Second Approach: Optimised Space Complexity
//        int row = 1;
//
//        while(row <= n) {
//            int col = 1;
//            while(col <= n) {
//                System.out.print("* ");
//                col++;
//            }
//
//            row++;
//            System.out.println();
//        }
    }
}

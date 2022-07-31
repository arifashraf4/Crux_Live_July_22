package Lec02;

import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //First Approach: stars takes extra space
        int row = 1;
        int stars = 1;
        while(row <= n) {
            int col = 1;
            while (col <= stars) {
                System.out.print("* ");
                col++;
            }
            //Next row Prep
            System.out.println();
            row++;
            stars++;
        }

        //Second Approach: Optimised Space Complexity
//        int row = 1;
//        while(row <= n) {
//            int col = 1;
//            while (col <= row) {
//                System.out.print("* ");
//                col++;
//            }
//            //Next row Prep
//            System.out.println();
//            row++;
//        }
    }
}

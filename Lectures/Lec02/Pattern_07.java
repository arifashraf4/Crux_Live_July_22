package Lec02;

import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = n;

        while(row <= n) {
            int i = 1;
            while (i <= stars) {
                //First Approach: Optimised Code
//                if(row == 1 || row == n || i == 1 || i == n) {
//                    System.out.println("* ");
//                } else {
//                    System.out.println("  ");
//                }
//                i++;
                //Second Approach
                if(row == 1 || row == n) {
                    System.out.print("* ");
                } else if (i == 1 || i == n) {
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

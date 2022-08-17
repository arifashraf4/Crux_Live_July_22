package Lec02;

import java.util.Scanner;

public class Pattern_26 {
    //First Approach: Doesn't take Double digit integers into account
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int space = n - 1;

        while(row <= n) {

            int i = 1;
            while(i <= space) {
                System.out.print("   ");
                i++;
            }

            int j = 1;
            while(j <= numCount) {
                if(j < 10) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print(j + " ");
                }
                j++;
            }

            row++;
            System.out.println();
            numCount += 2;
            space--;
        }

        //Second Approach: Optimised
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int row = 1;
//        int numCount = 1;
//        int space = n - 1;
//
//        while(row <= n) {
//
//            int i = 1;
//            while(i <= space) {
//                System.out.print("\t");
//                i++;
//            }
//
//            int j = 1;
//            while(j <= numCount) {
//                    System.out.print(j + "\t");
//                j++;
//            }
//
//            row++;
//            System.out.println();
//            numCount += 2;
//            space--;
//        }
    }
}

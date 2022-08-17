package Lec02;

import java.util.Scanner;

public class Pattern_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int num = 1;
        int space = n - 1;

        while(row <= n) {

            int i = 1;
            while(i <= space) {
                System.out.print("   ");
                i++;
            }

            int j = 1;
            while(j <= numCount) {
                if(num < 10) {
                    System.out.print(num + "  ");
                } else {
                    System.out.print(num + " ");
                }
                num++;
                j++;
            }

            row++;
            System.out.println();
            numCount += 2;
            space --;
        }

        //Second Approach: Optimised
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int row = 1;
//        int numCount = 1;
//        int num = 1;
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
//                if(num < 10) {
//                    System.out.print(num + "\t");
//                } else {
//                    System.out.print(num + "\t");
//                }
//                num++;
//                j++;
//            }
//
//            row++;
//            System.out.println();
//            numCount += 2;
//            space --;
//        }
    }
}

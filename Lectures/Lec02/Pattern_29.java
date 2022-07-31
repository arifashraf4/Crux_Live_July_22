package Lec02;

import java.util.Scanner;

public class Pattern_29 {
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
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= numCount) {
                if(j == 1 || j == numCount) {
                    System.out.print(num + " ");
                } else {
                    System.out.print(0 + " ");
                }
                j++;
            }

            row++;
            System.out.println();
            num++;
            numCount += 2;
            space--;
        }
    }
}

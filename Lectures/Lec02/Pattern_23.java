package Lec02;

import java.util.Scanner;

public class Pattern_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int num = 1;
        int space = n - 1;


        while(row <= n) {

            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j <= num) {
                System.out.print("1 ");
                j++;
            }

            row++;
            System.out.println();
            num += 2;
            space --;
        }
    }
}

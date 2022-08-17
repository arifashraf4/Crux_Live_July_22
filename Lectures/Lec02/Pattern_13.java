package Lec02;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        //Mirror Pattern: Star Pattern - Horizontal Mirroring
        //Mirror Pattern: Number Pattern - Vertical Mirroring
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = 1;

        while(row <= 2*n-1) {

            int i = 1;
            while(i <= stars) {
                System.out.print("* ");
                i++;
            }

            //Mirroring
            if(row < n) {
                stars++;
            } else {
                stars--;
            }

            row++;
            System.out.println();
        }
    }
}

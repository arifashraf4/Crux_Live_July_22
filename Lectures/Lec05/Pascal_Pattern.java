package Lec05;

import java.util.Scanner;

public class Pascal_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int numCount = 1;
        while (row < n) {
            int i = 0;
            int val = 1;

            //num
            while (i < numCount) {
                System.out.print(val + "\t");
                //Preparation for the next number in the pascal series
                val = (row - i)*val/(i+1);
                i++;
            }

            row++;
            System.out.println();
            numCount++;
        }
    }
}

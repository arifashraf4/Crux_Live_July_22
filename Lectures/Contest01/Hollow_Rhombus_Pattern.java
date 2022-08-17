package Contest01;

import java.util.Scanner;
/*
     *****
    *   *
   *   *
  *   *
 *****
 */
public class Hollow_Rhombus_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = n;
        int space = n-1;

        while (row <= n) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }

            //stars
            int j = 1;
            while (j <= stars) {
                if(row == 1 || row == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                j++;
            }

            //Next Step
            row++;
            System.out.println();
            space--;

        }
    }
}

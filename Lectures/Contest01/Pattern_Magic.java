package Contest01;

import java.util.Scanner;

public class Pattern_Magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int stars = n;
        int space = -1;

        while (row <= n * 2 - 1) {
            //L-star
            int i = 1;
            while (i <= stars) {
                System.out.print("*");
                i++;
            }

            //space
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            //R-Star
            int k = 1;
            if(row == 1 || row == n * 2 - 1) {
                k = 2;
            }
            while (k <= stars) {
                System.out.print("*");
                k++;
            }

            //Mirroring(Horizontal)
            if(row < n) {
                space += 2;
                stars--;
            } else {
                space -= 2;
                stars++;
            }

            row++;
            System.out.println();
        }
    }
}

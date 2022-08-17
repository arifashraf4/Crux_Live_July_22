package Contest01;

import java.util.Scanner;

public class Pattern_With_Zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;

        while (row <= n) {
            //num
            int i = 1;
            while (i <= numCount) {
                if(i == 1 || i == row) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print(0 + "\t");
                }
                i++;
            }

            //Next steps
            row++;
            numCount++;
            System.out.println();
        }
    }
}

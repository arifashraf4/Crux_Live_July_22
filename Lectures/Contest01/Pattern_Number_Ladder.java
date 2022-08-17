package Contest01;

import java.util.Scanner;

public class Pattern_Number_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int num = 1;

        while (row <= n) {
            //nums
            int i = 1;
            while(i <= numCount) {
                System.out.print(num + "\t");
                num++;
                i++;
            }

            row++;
            numCount++;
            System.out.println();
        }
    }
}

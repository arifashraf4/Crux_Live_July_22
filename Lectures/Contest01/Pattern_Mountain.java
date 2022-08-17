package Contest01;

import java.util.Scanner;

//        Take N (number of rows), print the following pattern (for N = 4).
//
//        1           1
//        1 2       2 1
//        1 2 3   3 2 1
//        1 2 3 4 3 2 1
public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int space = 2 * n - 3;

        while (row <= n){
            //num5
            int num = 1;
            int i = 1;
            if(row == n) {
                i = 2;
            }
            while (i <= numCount) {

                System.out.print(num + "\t");
                num++;
                i++;
            }
            //space
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }
            //num4
            int num2 = row;
            int k = 1;

            while (k <= numCount) {
                System.out.print(num2 + "\t");
                num2--;
                k++;
            }


            row++;
            System.out.println();
            space-=2;
            numCount++;
        }
    }
}

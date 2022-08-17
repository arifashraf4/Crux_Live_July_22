package Contest01;

import java.util.Scanner;
/*
Take N as input. For a value of N=7, we wish to draw the following pattern :

                        1
                    2 1   1 2
                3 2 1       1 2 3
            4 3 2 1           1 2 3 4
                3 2 1       1 2 3
                    2 1   1 2
                        1
 */
public class Pattern_Double_Sided_Arrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int space = n/2;
        int space2 = -1;

        while (row <= n) {
            //space
            int i = 1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }

            //num
            int j = 1;
            int num = numCount;
            if(row == 1 || row == n) {
                j = 2;
            }
            while (j<=numCount) {
                System.out.print(num + " ");
                j++;
                num--;
            }

            //space
            int k = 1;
            while (k <= space2) {
                System.out.print("  ");
                k++;
            }

            //num
            int l = 1;
            int num2 = 1;
            while (l <= numCount) {
                System.out.print(num2 + " ");
                l++;
                num2++;
            }

            if(row < n / 2 + 1) {
                numCount++;
                space--;
                space2+=2;
            } else {
                numCount--;
                space++;
                space2-=2;
            }
            //Next Steps
            row++;
            System.out.println();
        }

    }
}

package Contest01;


import java.util.Scanner;

/*
                         1
                       2 3 2
                     3 4 5 4 3
                       2 3 2
                         1
 */

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int numCount = 1;
        int space = n-1;
        int nu = 1;

        while (row <= n * 2 - 1) {
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            int num = nu;

            int j = 1;
            while (j <= numCount) {
                System.out.print(num + "\t");
                if(j<=numCount/2) {
                    num++;
                } else {
                    num--;
                }
                j++;
            }

            if(row < n) {
                nu++;
                space--;
                numCount += 2;
            } else{
                nu--;
                space++;
                numCount -= 2;
            }

            row++;
            System.out.println();
        }

    }
}

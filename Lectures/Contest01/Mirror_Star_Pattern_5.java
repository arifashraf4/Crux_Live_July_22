package Contest01;

import java.util.Scanner;

public class Mirror_Star_Pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stars = 1;
        int row = 1;
        int space = n/2;

        while(row <= n) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            //stars
            int j = 1;
            while (j <= stars) {
                System.out.print("*\t");
                j++;
            }

            if(row < n/2+1) {
                space--;
                stars+=2;
            } else {
                space++;
                stars-=2;
            }

            row++;
            System.out.println();
        }
    }
}

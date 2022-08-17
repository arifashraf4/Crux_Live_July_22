package Contest01;

import java.util.Scanner;

public class Hollow_Diamond_Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n/2 + 1;
        int space = -1;

        while(row <=n) {
            //star
            int i = 1;
            while (i <= star) {
                System.out.print("*\t");
                i++;
            }

            //space
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }

            //star
            int k = 1;
            //Second approach to remove extra star
            if(row==1 || row==n) {
                k = 2;
            }
            while(k <= star) {
//                if(k == n/2+1) {
//                    break;
//                } else {
                System.out.print("*\t");
//                }
                k++;
            }

            //Mirroring
            if(row < n/2+1) {
                star--;
                space+=2;
            } else {
                star++;
                space-=2;
            }

            row++;
            System.out.println();
        }
    }
}

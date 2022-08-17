package Contest01;

import java.util.Scanner;

public class Pattern_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numCount = 1;
        int row = 1;
        int space = n - 1;

        while(row <= n) {
            //space
            int i = 1;
            while(i <= space) {
                System.out.print("\t");
                i++;
            }

            //nums
            int num = row;
            int j = 1;
            while(j <= numCount) {
                System.out.print(num + "\t");
                if(j <= numCount/2) {
                    num++;
                } else {
                    num--;
                }
                j++;
            }

            row++;
            System.out.println();
            space--;
            numCount+=2;
        }
    }
}

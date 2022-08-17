package Contest01;

import java.util.Scanner;
/*
 5 4 3 2 1 0 1 2 3 4 5
   4 3 2 1 0 1 2 3 4
     3 2 1 0 1 2 3
       2 1 0 1 2
         1 0 1
           0
         1 0 1
       2 1 0 1 2
     3 2 1 0 1 2 3
   4 3 2 1 0 1 2 3 4
 5 4 3 2 1 0 1 2 3 4 5
 */
public class Pattern_HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numCount = n * 2 + 1;
        int row = 0;
        int space = 0;
        int num = n;

        while (row < n * 2 + 1) {
            //space
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            //numCount
            int val = num;
            int j = 1;
            while (j <= numCount) {
                //Approach to break an extra row if row <= n * 2 + 1
//                if(row == n * 2 + 1) {
//                    break;
//                }
                System.out.print(val+"\t");
                if(j <= numCount/2) {
                    val--;
                } else {
                    val++;
                }
                j++;
            }

            //Mirroring
            if(row < n) {
                space++;
                numCount-=2;
                num--;
            } else {
                space--;
                numCount+=2;
                num++;
            }
            row++;
            System.out.println();

        }
    }
}

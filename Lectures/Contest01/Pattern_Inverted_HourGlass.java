package Contest01;

import java.util.Scanner;

    public class Pattern_Inverted_HourGlass {
        /*
    n = 5
                 5                   5
                 5 4               4 5
                 5 4 3           3 4 5
                 5 4 3 2       2 3 4 5
                 5 4 3 2 1   1 2 3 4 5
                 5 4 3 2 1 0 1 2 3 4 5
                 5 4 3 2 1   1 2 3 4 5
                 5 4 3 2       2 3 4 5
                 5 4 3           3 4 5
                 5 4               4 5
                 5                   5
    */
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int row = 0;
            int space = n * 2 - 1;
            int numCount = 1;
            int num2 = n;

            while(row <= n * 2 + 1) {
                //nums
                int num = n;
                int i = 1;
                //Second Approach To Remove Extra 0
                // if(row == n && i == n) {
                //     i = 2;
                // }
                while(i <= numCount) {
                    System.out.print(num + " ");
                    i++;
                    num--;
                }
                //space
                int j = 1;
                while(j <= space) {
                    System.out.print("  ");
                    j++;
                }

                //num
                int val = num2;
                int k = 1;
                //First Approach To Remove Extra 0
                if(row == n && k == 1) {
                    val++; // or val = 1
                    k = 2;
                }
                while(k <= numCount) {
                    System.out.print(val + " ");
                    k++;
                    val++;
                }

                //horizontal mirroring
                if(row < n) {
                    numCount++;
                    space-=2;
                    num2--;
                } else {
                    numCount--;
                    space+=2;
                    num2++;
                }
                //Next Step
                row++;
                System.out.println();
            }
        }
    }

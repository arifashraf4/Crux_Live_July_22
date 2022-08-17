package Contest01;

import java.util.Scanner;
/*
Pascal Triangle: n = 6
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1
 */
public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int numCount = 1;
        while (row < n) {
            int i = 0;
            int val = 1;

            //num
            while (i < numCount) {
                System.out.print(val + "\t");
                //Preparation for the next number in the pascal series
                val = (row - i)*val/(i+1);
                i++;
            }

            row++;
            System.out.println();
            numCount++;


        }
    }
}

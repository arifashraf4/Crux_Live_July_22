package Contest01;

import java.util.Scanner;

public class Print_Series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int i = 1;
        int j = 1;
        while (i <= n1) {
                int num = (3 * j) + 2;
                if(num % n2 != 0) {
                    System.out.println(num);
                    i++;
                }
                j++;
        }
    }
}

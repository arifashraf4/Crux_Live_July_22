package Contest01;

import java.util.Scanner;

public class Odd_And_Even_Back_In_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 1;

        while (i <= T) {
            int even = 0;
            int odd = 0;

            int n = sc.nextInt();
            while (n != 0) {
                int digit = n % 10;
                if(digit % 2 != 0) {
                    n /= 10;
                    odd += digit;
                } else {
                    n /= 10;
                    even += digit;
                }

            }

            if(even % 4 == 0 || odd % 3 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            i++;
        }
    }
}

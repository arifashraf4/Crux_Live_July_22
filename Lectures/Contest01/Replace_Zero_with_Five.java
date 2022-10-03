package Contest01;

import java.util.Scanner;

public class Replace_Zero_with_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        replace(n);
    }

    public static void replace(int n) {
        int mul = 1;
        int ans = 0;
        while (n != 0) {
            int rem = n % 10;
            n = n / 10;
            if (rem == 0) {
                rem = 5;
            }

            ans = rem * mul + ans;
            mul *= 10;
        }

        System.out.println(ans);

    }
}

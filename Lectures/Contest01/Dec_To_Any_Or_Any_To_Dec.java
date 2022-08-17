package Contest01;

import java.util.Scanner;

public class Dec_To_Any_Or_Any_To_Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int source = sc.nextInt();
        int dest = sc.nextInt();
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int rem = n % dest;
            sum = sum + rem * mul;
            mul = mul * source;
            n = n / dest;
        }

        System.out.println(sum);
    }
}

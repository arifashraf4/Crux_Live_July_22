package Contest01;

import java.util.Scanner;

/*
Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.
 */
public class Simple_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;
        while (sum >= 0) {
            System.out.println(n);
            n = sc.nextInt();
            sum = sum + n;
        }
    }
}

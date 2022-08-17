package Lec08;

import java.util.Scanner;

public class Is_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmstrongNumber(n);
        System.out.println(isArmstrongNumber(n));
    }

    public static boolean isArmstrongNumber(int n) {
        int cod = countOfDigit(n);
        int ans = 0;
        int x = n;
        while (n != 0) {
            int rem = n % 10;
            ans = (int) (ans + Math.pow(rem, cod));
            n = n / 10;
        }
        if(ans == x) {
            return  true;
        } else {
            return false;
        }
    }

    public static int countOfDigit(int n) {
        int count = 0;
        while (n > 0) {
            n = n/10;
            count++;
        }
        return count;
    }
}

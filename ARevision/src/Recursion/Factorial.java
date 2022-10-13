package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        fact(n, ans);
        System.out.println(fact2(n, ans));
        System.out.println(fact3(n));
    }

    public static void fact(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        fact(n - 1, ans * n);
    }

    public static int fact2(int n, int ans) {
        if (n == 0) {
            return ans;
        }

        return fact2(n - 1, ans * n);
    }

    public static int fact3(int n) {
        if (n == 0) {
            return 1;
        }

        int fn = fact3(n - 1);
        return fn * n;
    }
}

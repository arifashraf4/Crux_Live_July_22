package Lec21;

public class Fact_Tail {
    public static void main(String[] args) {
        int n = 5;
        int ans = 1;
        fact(n, ans);
    }

    public static int fact(int n, int ans) {
        if(n == 0) {
            return ans;
        }

        return fact(n - 1, ans * n);
    }
}

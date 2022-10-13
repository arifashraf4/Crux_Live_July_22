package Contest01;

public class Nth_Triangle {
    public static void main(String[] args) {
        int n = 4;
        int ans = 0;

        nthTriangle(n, ans);
    }

    public static void nthTriangle(int n, int ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        nthTriangle(n - 1, ans + n);
    }
}

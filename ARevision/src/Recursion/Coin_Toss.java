package Recursion;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        String ans = "";
        System.out.println(printOutcomes(n, ans));

    }

    //Printing all Outcomes + Count of Outcomes
    public static int printOutcomes(int n, String ans) {

        if (n == 0) {
            System.out.println(ans);
            return 1;
        }

        int a = printOutcomes(n - 1, ans + "H");
        int b = printOutcomes(n - 1, ans + "T");

        return a + b;
    }
}

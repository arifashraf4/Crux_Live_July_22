package Lec22;

public class Coin_Toss_No_Consecutive_Head {
    public static void main(String[] args) {
        int n = 3;
        String ans = "";
        printOutcome(n, ans);

    }

    //Don't print possibilities with HH together
    public static void printOutcome(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if (ans.length() == 0 || ans.charAt(ans.length()-1) != 'H') {
            printOutcome(n - 1, ans + "H");
        }

        printOutcome(n - 1, ans + "T");
    }
}

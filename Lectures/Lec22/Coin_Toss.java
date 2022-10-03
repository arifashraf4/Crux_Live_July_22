package Lec22;

public class Coin_Toss {
    public static void main(String[] args) {
        int n = 3;
        printOutcome(n, "");
    }

    public static void printOutcome(int n, String ans) {
        if (n == 0) {
            System.out.println(ans + " ");
            return;
        }

        //Print all outcomes
        printOutcome(n - 1, ans + "H");
        printOutcome(n - 1, ans + "T");

//        //Don't print possibilities with HH together
//        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
//            printOutcome(n - 1, ans + "H");
//        }
//        printOutcome(n - 1, ans + "T");
    }
}

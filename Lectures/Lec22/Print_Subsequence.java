package Lec22;

public class Print_Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        printAnswer(str, "");
    }

    public static void printAnswer(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        printAnswer(ques.substring(1), ans);
        printAnswer(ques.substring(1), ans + ch);

    }
}

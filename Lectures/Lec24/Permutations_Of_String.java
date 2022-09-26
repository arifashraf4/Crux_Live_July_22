package Lec24;

public class Permutations_Of_String {
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        permutations(str, "");
    }

    public static void permutations(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            String s1 = ques.substring(0, i);
            String s2 = ques.substring(i + 1);
            permutations(s1+s2, ans+ques.charAt(i));
        }
    }
}

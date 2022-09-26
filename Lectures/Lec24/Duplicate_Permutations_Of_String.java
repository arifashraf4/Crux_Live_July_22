package Lec24;

public class Duplicate_Permutations_Of_String {
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

        boolean [] visited = new boolean[26];
        for (int i = 0; i < ques.length(); i++) {
            char ch = ques.charAt(i);
            if (visited[ch - 'a'] == false) {
                visited[ch - 'a'] = true;
                String s1 = ques.substring(0, i);
                String s2 = ques.substring(i + 1);

                permutations(s1+s2, ans + ch);
            }

        }
    }
}

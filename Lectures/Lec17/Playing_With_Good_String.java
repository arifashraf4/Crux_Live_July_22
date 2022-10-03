package Lec17;

import java.util.Scanner;

public class Playing_With_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String str = "aaabaaaacaeiou";
        System.out.println(goodString(str));

    }

    public static int goodString(String str) {
        int ans = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch) == true) {
                int count = 0;
                while (i < str.length() && isVowel(str.charAt(i)) == true) {
                    count++;
                    i++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}

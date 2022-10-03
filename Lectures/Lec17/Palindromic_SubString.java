package Lec17;

public class Palindromic_SubString {
    public static void main(String[] args) {
        String str = "nitin";
        substring(str);
    }

    public static void substring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                isPalindrome(str.substring(i, j));
            }
        }
    }

    public static void isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return;
            }

            i++;
            j--;
        }

        System.out.println(str);
    }
}

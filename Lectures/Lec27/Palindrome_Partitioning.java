package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String str = "nitin";
        List<String> ll = new ArrayList<>();
        List<List<String>> ans = new ArrayList<>();
        partitioning(str,ll, ans);
        System.out.println(ans);
    }

    public static void partitioning(String ques, List<String> ll, List<List<String>> ans) {
        if (ques.length() == 0) {
//            System.out.println(ll);
//            ArrayList<String> list = new ArrayList<>(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String s = ques.substring(0, i);
            if (isPalindrome(s) == true) {
                ll.add(s);
                partitioning(ques.substring(i), ll, ans);
                //Backtrack: Since arraylist is being used which changes the original ans in heap memory
                ll.remove(ll.size() - 1);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

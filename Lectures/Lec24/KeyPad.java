package Lec24;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    static String [] key = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String str = "23";
        List<String> list = new ArrayList<>();
        keypress(str,"", list);
        System.out.println(list);
    }

    public static void keypress(String ques, String ans, List<String> list) {
        if (ques.length() == 0) {
//            System.out.print(ans + " ");
            list.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        String press = key[ch - '0'];
        for (int i = 0; i < press.length(); i++) {
            keypress(ques.substring(1), ans + press.charAt(i), list);
        }
    }
}

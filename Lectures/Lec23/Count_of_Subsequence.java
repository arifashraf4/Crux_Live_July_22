package Lec23;

public class Count_of_Subsequence {
    static int count = 0;
    public static void main(String[] args) {
        String str = "abc";
        answerCount(str,"");
        System.out.println(count);
//        //Or
//        System.out.println(answerCount2(str   ,""));
    }

    public static void answerCount(String ques, String ans) {
        if (ques.length() == 0) {
//            System.out.println(ans);
            count++;
            return;
        }

        char ch = ques.charAt(0);
        answerCount(ques.substring(1), ans);
        answerCount(ques.substring(1), ans + ch);
    }

//    //2nd Approach:
//    public static int answerCount2(String ques, String ans) {
//        if (ques.length() == 0) {
////            System.out.println(ans);
//
//            return 1;
//        }
//
//        char ch = ques.charAt(0);
//        int a = answerCount2(ques.substring(1), ans);
//        int b = answerCount2(ques.substring(1), ans + ch);
//        return a + b;
//    }
}

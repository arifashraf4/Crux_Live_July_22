package Recursion;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
//        boardPath1(n, "");
        boardPath2(0, n, "");
    }

    //Approach 1: My Way
    public static void boardPath1(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }

        if (n < 0) {
            return;
        }

//        //Approach 1:
//        boardPath1(n - 1, ans + 1);
//        boardPath1(n - 2, ans + 2);
//        boardPath1(n - 3, ans + 3);

        //Approach 2:
        for (int dice = 1; dice <= 3 ; dice++) {
            boardPath1(n - dice, ans + dice);
        }
    }

    //Approach 2: Monu Bhaiya's Approach
    public static void boardPath2(int curr, int n, String ans) {
        if (curr == n) {
            System.out.println(ans);
            return;
        }

        if (curr > n) {
            return;
        }

//        //Approach 1:
//        boardPath2(curr + 1, n, ans + 1);
//        boardPath2(curr + 2, n, ans + 2);
//        boardPath2(curr + 3, n, ans + 3);

        //Approach 2:
        for (int dice = 1; dice <= 3 ; dice++) {
            boardPath2(curr + dice, n , ans + dice);
        }
    }
}

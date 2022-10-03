package Lec23;

public class Board_Path {
    public static void main(String[] args) {
        int n = 4;
        boardPath(0,n, "");
        System.out.println(boardPathCount(0, n, ""));
    }

    public static void boardPath(int curr, int n, String ans) {
        if (curr == n){
            System.out.println(ans);
            return;
        }
        if (curr > n){
            return;
        }

//        //1st Approach:
//        boardPath(curr+1,n, ans+1);
//        boardPath(curr+2,n, ans+2);
//        boardPath(curr+3,n, ans+3);
        //Or
        //2nd Approach:
        for (int dice = 1; dice <= 3; dice++) {
            boardPath(curr + dice, n, ans + dice);
        }
    }

    public static int boardPathCount(int curr, int n, String ans) {
        if (curr==n){
            return 1;
        }
        if (curr>n){
            return 0;
        }

//        //1st Approach:
//        int a1 = boardPathCount(curr+1,n, ans+1);
//        int b1 = boardPathCount(curr+2,n, ans+2);
//        int c1 = boardPathCount(curr+3,n, ans+3);
//        return a1 + b1 + c1;
        //Or
        //2nd Approach:
        int a1 = 0;
        for (int dice = 1; dice <= 3; dice++) {
            a1 = a1 + boardPathCount(curr + dice, n, ans + dice);
        }
        return a1;
    }
}

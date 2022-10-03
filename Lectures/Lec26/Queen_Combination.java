package Lec26;

public class Queen_Combination {
    public static void main(String[] args) {
        int n = 4; // Array size
        int tq = 2; // Total Queen
        boolean [] board = new boolean[n];
        printAnswer(board, tq, 0, "", 0);
    }

    public static void printAnswer(boolean[] board, int tq, int qpsf, String ans, int last) {
        if (tq == qpsf) {
            System.out.println(ans);
            return;
        }
        for (int i = last; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                printAnswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                //Backtracking
                board[i] = false;
            }
        }
    }
}

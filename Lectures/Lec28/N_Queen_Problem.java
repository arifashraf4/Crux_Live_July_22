package Lec28;

public class N_Queen_Problem {
    public static void main(String[] args) {
        int n = 4;
        boolean [][] board = new boolean[n][n];
        nQueen(board, 0, n);

    }

    public static void nQueen(boolean[][] board, int row, int tq) {
        if (tq == 0) {
            display(board);
            System.out.println();
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isItSafe(board, row, col) == true) {
                board[row][col] = true;
                nQueen(board, row + 1, tq - 1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isItSafe(boolean[][] board, int row, int col) {
        //Upper Side
        int r = row;
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }
        //Upper Right Diagonal
        r = row;
        int c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            c++;
            r--;
        }

        //Upper Left Diagonal
        r = row;
        c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            c--;
            r--;
        }
        return true;
    }

    public static void display(boolean [][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}

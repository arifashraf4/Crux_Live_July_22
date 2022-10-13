package Lec29;

import java.util.ArrayList;
import java.util.List;

public class Combinations { //Q.77 - Combinations (Leetcode)
    public static void main(String[] args) {
        int n = 4; // Array size
        int k = 2; // Total Queen
        boolean [] board = new boolean[n];
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printAnswer(board, k, 0, list, 0, ans);
        System.out.println(ans);
    }

    public static void printAnswer(boolean[] board, int k, int qpsf, List<Integer> list, int last, List<List<Integer>> ans) {
        if (k == qpsf) {
//            System.out.println(ans);
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for (int i = last; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                list.add(i + 1);
                printAnswer(board, k, qpsf + 1, list, i + 1, ans);
                //Backtracking
                board[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}

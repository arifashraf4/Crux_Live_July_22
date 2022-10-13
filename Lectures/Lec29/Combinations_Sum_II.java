package Lec29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations_Sum_II {
    public static void main(String[] args) {

        int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
        int target = 8;
        Arrays.sort(arr);
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printCombination(arr, target, ll, 0, ans);
        System.out.println(ans);

    }

    public static void printCombination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
        if (amount == 0) {
            // System.out.println(ll);
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i = idx; i < coin.length; i++) {
            if(i!=idx  && coin[i]==coin[i-1]) {
                continue;
            }
            if (amount >= coin[i]) {
                ll.add(coin[i]);
                printCombination(coin, amount - coin[i], ll, i + 1, ans);
                ll.remove(ll.size() - 1);
            }

        }
    }
}

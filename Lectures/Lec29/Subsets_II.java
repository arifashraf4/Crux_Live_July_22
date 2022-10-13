package Lec29;
import java.util.*;

public class Subsets_II {
    public static void main(String[] args) {
             int[] arr = {1, 4, 4, 4};
            Arrays.sort(arr);
            List<Integer> list = new ArrayList<>();
            List<List<Integer>> ans = new ArrayList<>();
            subsetPrint(arr, 0, list, ans);
            System.out.println(ans);
    }

    public static void subsetPrint(int[] arr, int i, List<Integer> list, List<List<Integer>> ans) {
//        //Approach 1:
//        if (i == arr.length) {
//            System.out.println(ans);
//            return;
//        }
//
//        subsetPrint(arr, i + 1, ans);
//        subsetPrint(arr, i + 1, ans + arr[i] + " ");

        //Approach 2: Using Loop
//        System.out.println(list);
        ans.add(new ArrayList<>(list));
        for (int j = i; j < arr.length; j++) {
            if (j != i && arr[j] == arr[j - 1]) {
                continue;
            }
            list.add(arr[j]);
            subsetPrint(arr, j + 1, list, ans);
            list.remove(list.size() - 1);
        }
    }
}

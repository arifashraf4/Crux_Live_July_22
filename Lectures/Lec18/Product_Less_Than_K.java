package Lec18;

import java.util.Scanner;

public class Product_Less_Than_K {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 3};
        int k = 10;

    }

    public static int productLessThanK(int[] arr, int k) {
        int si = 0;
        int ei = 0;
        int product = 1;
        int ans = 0;

        while (ei < arr.length) {
            //Grow Window
            product = product * arr[ei];

            //Shrink Widow
            while (product >= k && si <= ei) {
                product = product / arr[si];
                si++;
            }

            //Calculate Answer
            ans = ans + ei - si + 1;
            ei++;
        }

        return ans;

    }
}

package Contest01;

import java.util.Scanner;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = productOfArrayExceptSelf(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] productOfArrayExceptSelf(int[] arr) {

        int[] left = new int[arr.length];
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * arr[i - 1];
        }

        int[] right = new int[arr.length];
        right[arr.length - 1] = 1;
        for (int i = right.length - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = left[i] * right[i];
        }

        return arr;
    }
}

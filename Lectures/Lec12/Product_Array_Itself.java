package Lec12;

public class Product_Array_Itself {
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,4,5};
        int[] ans = product_Array(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] product_Array(int[] arr) {

        int[] left = new int[arr.length];
        left[0] = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i - 1] * arr[i-1];
        }

        int[] right = new int[arr.length];
        int n = arr.length;
        right[n-1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < right.length; i++) {
            left[i] = left[i] * right[i];
        }

        return left;
    }
}

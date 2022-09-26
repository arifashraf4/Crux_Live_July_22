package Lec10;

import java.util.Scanner;
//Not as Optimised as Rotating with Reverse
public class Rotate_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] arr = {1,2,3,4,5,6,7};

        rotateArray(arr, k);
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        while (k > 0) {
            int temp = arr[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }

            arr[0] = temp;
            k--;
        }
    }
}

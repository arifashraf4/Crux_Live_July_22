package Contest01;

import java.util.Scanner;

public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void reverseArray(int[] arr) {
        int end = arr.length - 1;
            for (int start = 0; start < end; start++) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }
    }
}

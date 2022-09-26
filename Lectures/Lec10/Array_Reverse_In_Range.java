package Lec10;

import java.util.Scanner;

public class Array_Reverse_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int i = sc.nextInt();
        int j = sc.nextInt();
        reverse_In_Range(arr,i,j);

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void reverse_In_Range(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

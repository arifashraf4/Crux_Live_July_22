package Lec19;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_Of_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
//        int[] arr1 = { 1, 5};
//        int[] arr2 = { 2, 0};
        sumOfTwoArrays(arr1, arr2);

    }

    public static void sumOfTwoArrays(int []arr1, int[] arr2) {
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (i >= 0 || j >= 0) {
            int sum = 0;

            if(i >= 0) {
                sum += arr1[i];
                i--;
            }

            if(j >= 0) {
                sum += arr2[j];
                j--;
            }

            sum += carry;
            list.add(sum % 10);
            carry = sum / 10;
        }

        if(carry > 0) {
            list.add(carry);
        }
        for (int k = list.size() - 1; k >= 0; k--) {
            System.out.print(list.get(k) + " ");
        }
    }
}

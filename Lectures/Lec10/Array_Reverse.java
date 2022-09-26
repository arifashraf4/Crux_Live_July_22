package Lec10;

import java.util.Scanner;

public class Array_Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        //Reverse without function
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        //Reverse Array with return Function
//        reverseArray(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

        //Reverse Array without return Function
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//    //With return statement
//    public static int[] reverseArray(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        return arr;
//    }

    //Without return statement
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

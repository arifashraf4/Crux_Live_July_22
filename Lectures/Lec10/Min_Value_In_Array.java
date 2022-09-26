package Lec10;

import java.util.Scanner;

public class Min_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

        int[] arr = {-1, 4, 11, -15, 50, 100};
        System.out.println(min_value(arr));

//        //Min Value(Index) without function
//        int[] arr = {-1, 4, 11, -15, 50, 100};
//        int min = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] < arr[min]) {
//                min = i;
//            }
//        }
//
//        System.out.println(min);

    }

    public static int min_value(int[] arr) {
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex; //Printing index with minimum value
    }
}

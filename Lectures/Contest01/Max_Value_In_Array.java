package Contest01;

import java.util.Scanner;

public class Max_Value_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        max(arr);
    }

    //First Approach: Without In-Built function
    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

//    //Second Approach: Using Math.max() function
//    public static void max2(int[] arr) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length - 1; i++) {
//            max = Math.max(arr[i], arr[i+1]);
//        }
//        System.out.println(max);
//    }

//    Third Approach: with return statement
    public static int max3(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            max = Math.max(arr[i], arr[i+1]);
        }
        return max;
    }
}

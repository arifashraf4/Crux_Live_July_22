package Lec14;

import java.util.Scanner;

public class Two_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        System.out.println(arr);

        int[][] other = arr;
        //Memory location of 0th index
        System.out.println(arr[0]);
        //All values are 0 in column by default
        System.out.println(arr[0][1]);
        //row
        System.out.println(arr.length);
        //column
        System.out.println(arr[0].length);

    }
}

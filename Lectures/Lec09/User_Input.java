package Lec09;

import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);
    }

    public static void display(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

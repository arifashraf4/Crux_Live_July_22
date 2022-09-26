package Contest01;

import java.util.Scanner;

public class Running_Sum_Of_Given_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sum(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
    }
}

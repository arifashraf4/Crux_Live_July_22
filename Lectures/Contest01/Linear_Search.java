package Contest01;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        linearSearch(arr, target);
    }

    public static void linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

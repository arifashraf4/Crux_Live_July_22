package Contest01;

import java.util.Scanner;

public class Target_Sum_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        sort(arr);
        sumPairs(arr, target);
    }

    //Using selection sort
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            //Swap mini with i
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
    }

    public static void sumPairs(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " and " + arr[j]);
                }
            }
        }
    }
}

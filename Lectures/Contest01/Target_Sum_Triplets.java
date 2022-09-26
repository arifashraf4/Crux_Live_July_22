package Contest01;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_Triplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        arr = Arrays.stream(arr).sorted().toArray();

        sumTriplets(arr,target);

    }

    public static void sumTriplets(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if(target == arr[i] + arr[j] + arr[k]) {
                        System.out.print(arr[i] + " " + arr[j] + " " + arr[k]);
                        System.out.println();
                    }
                }
            }
        }
    }
}

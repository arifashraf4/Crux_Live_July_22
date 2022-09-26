package Contest01;

import java.util.Scanner;

public class Pair_Of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();


        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }

            int M = sc.nextInt();

            prices(arr, M);
        }
    }

    public static void prices(int[] arr, int M) {
        int a = 0;
        int b = 0;
        int difference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if((arr[i] + arr[j] == M) && (Math.abs(arr[i] - arr[j]) < difference)) {
                    difference = Math.abs(arr[i] - arr[j]);
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        if(a < b) {
            System.out.println("Deepak should buy roses whose prices are " + a + " and " + b + ".");
        } else {
            System.out.println("Deepak should buy roses whose prices are " + b + " and " + a + ".");
        }
    }
}
package Contest01;

import java.util.Scanner;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            maxCircularSum(arr);

            t--;
        }
    }

    public static void maxCircularSum(int[] arr) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            ans = Math.max(ans, sum);

            if (sum < 0) {
                sum = 0;
            }
        }

        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int negTotalSum = 0;
        int ans2 = Integer.MIN_VALUE;
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = -(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            negTotalSum += arr2[i];
            ans2 = Math.max(ans2, negTotalSum);

            if (negTotalSum < 0) {
                negTotalSum = 0;
            }
        }

        int difference = totalSum + ans2;
        int circularSum = Math.max(ans, difference);

        System.out.println(circularSum);
    }
}

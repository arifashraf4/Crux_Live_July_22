package Contest01;

import java.util.Scanner;

public class Rain_Water_Trapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int v = 1;
        while (v <= T) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            int ans = waterTrapped(arr);
            System.out.println(ans);

            v++;
        }

    }

    public static int waterTrapped(int[] arr) {

        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        int[] rightMax = new int[arr.length];
        int n = arr.length;
        rightMax[n - 1] = arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return sum;
    }
}

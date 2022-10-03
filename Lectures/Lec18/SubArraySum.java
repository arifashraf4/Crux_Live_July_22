package Lec18;

public class SubArraySum {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2, 3, 14, 7, 11, 13, 18, 16};
        System.out.println(subArraySum(arr, k));
    }

    public static int subArraySum(int[] arr, int k) {
        int sum = 0;
        //First Window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int ans = sum;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            ans = Math.max(sum, ans);
        }

        return ans;

    }
}

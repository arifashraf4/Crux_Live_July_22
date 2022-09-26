package Lec13;

public class Kadane_Algorithm {
    public static void main(String[] args) {
        int[] arr = {2, 3, -5, 11, -1, 3};

        int ans = subArray(arr);
        System.out.println(ans);
    }

    public static int subArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans = Math.max(ans,sum);
            if(sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }
}

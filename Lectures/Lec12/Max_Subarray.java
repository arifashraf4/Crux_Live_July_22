package Lec12;

//Gives TLE: Not Optimised
public class Max_Subarray {
    public static void main(String[] args) {
        int[] arr = {2,-3, 5, -1, 7};

        System.out.println(max(arr));
    }

    public static int max(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                ans = Math.max(ans, sum);
                if(ans < sum) {
                    ans = sum;
                    int p = i;
                    int q = j;
                }
            }
        }
        return ans;
    }
}

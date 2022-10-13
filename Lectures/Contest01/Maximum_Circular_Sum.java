package Contest01;

public class Maximum_Circular_Sum {
    public static void main(String[] args) {
        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxCircularSum(arr));
    }

    public static int maxCircularSum(int[] arr) {
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
        for (int i = 0; i < arr.length; i++) {
            negTotalSum += -(arr[i]);
        }

        int difference = totalSum - negTotalSum;

        int circularSum = Math.max(ans, difference);

        return circularSum;
    }
}

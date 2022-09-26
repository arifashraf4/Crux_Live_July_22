package Contest01;

import java.util.Scanner;

public class Alex_Goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int q = sc.nextInt();

        for (int i = 1; i <= q; i++) {
            int A = sc.nextInt();
            int k = sc.nextInt();
            correctOrNot(arr,A,k);
        }
    }

    public static void correctOrNot(int[] arr, int A, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(A % arr[i] == 0) {
                count++;
            }
        }

        if(count >= k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

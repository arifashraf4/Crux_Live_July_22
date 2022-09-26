package Contest01;

import java.util.Scanner;

public class Inverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] inverseArray = inverse(arr,n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(inverseArray[i] + " ");
        }

    }

    //0 2 4 1 3
    public static int[] inverse(int[] arr, int n) {
        int[] narr = new int[n];
        for (int i = 0; i < narr.length; i++) {
            narr[i] = arr[i];
        }
        for (int i = 0; i < narr.length; i++) {
            int index = i;
            int temp = index;
            index = arr[i];
            narr[index] = temp;
        }

        return narr;
    }
}

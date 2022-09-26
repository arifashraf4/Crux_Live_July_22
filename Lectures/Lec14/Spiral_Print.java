package Lec14;

import java.util.Scanner;

public class Spiral_Print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        spiral(arr);
    }

    public static void spiral(int[][] arr) {
        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;

        int te = arr.length * arr[0].length;
        int count = 0;
        while(count < te) {

            for (int i = minc; i <= maxc && count < te; i++) {
                System.out.print(arr[minr][i] + " ");
                count++;
            }
            minr++;

            for (int i = minr; i <= maxr && count < te; i++) {
                System.out.print(arr[i][maxc] + " ");
                count++;
            }
            maxc--;

            for (int i = maxc; i >= minc && count < te; i--) {
                System.out.print(arr[maxr][i] + " ");
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count < te; i--) {
                System.out.print(arr[i][minc] + " ");
                count++;
            }
            minc++;
        }
    }
}

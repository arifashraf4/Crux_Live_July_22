package Lec20;

import java.util.Arrays;
import java.util.Scanner;

public class Aggressive_Cows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // No.of Test Cases

        while (t > 0) {
            int nos = sc.nextInt(); //No.of Stalls
            int noc = sc.nextInt(); //No.of Cows
            int[] stall = new int[nos];
            for (int i = 0; i < stall.length; i++) {
                stall[i] = sc.nextInt();
            }

            Arrays.sort(stall);
            System.out.println(largestMinimumDistance(stall,noc));
            t--;
        }

    }

    public static int largestMinimumDistance(int[] stall, int noc) {
        int start = 0; // Minimum separation
        int n = stall.length;
        int end = stall[n-1]-stall[0]; // Maximum separation
        int ans = 0;
        while (start <= end) {
            int mid = (start + end)/2;
            if(isItPossible(stall,noc,mid) == true) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] stall, int noc, int mid) {
        int cow = 1;
        int pos = stall[0];
        int i = 1;
        while(i < stall.length) {
            if(stall[i] - pos >= mid) {
                cow++;
                pos = stall[i];
            }

            if(cow == noc) {
                return true;
            }

            i++;
        }
        return false;
    }
}

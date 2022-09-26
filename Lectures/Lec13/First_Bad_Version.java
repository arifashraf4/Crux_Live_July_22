package Lec13;

import java.util.Scanner;

public class First_Bad_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        firstBadVersion(n);

    }

    public static int firstBadVersion(int n) {
        //Copy this to leetcode
        int start = 1;
        int end = n;
        int bad = 1;

        while (start <= end) {
            int mid = start + (start - end) / 2;

            if (isBadVersion(mid) == true) {
                bad = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return bad;
    }

    //Leetcode Question: This function doesn't work. Is only added to remove error.
    public static boolean isBadVersion(int n) {
        return false;
    }
}

package Lec20;

import java.util.Scanner;

public class Book_Allocation {
    public static void main(String[] args) {
        int[] page = {10, 20, 30, 40};
        int nos = 2; // No.of Students

        System.out.println(minPage(page, nos));

    }

    public static int minPage(int[] page, int nos) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < page.length; i++) {
            end = end + page[i];
        }

        int ans = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(isItPossible(page, nos, mid) == true) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isItPossible(int[] page, int nos, int mid) {
        int student = 1;
        int readPage = 0;
        int i = 0;
        while (i < page.length) {
            if(readPage + page[i] <= mid) {
                readPage += page[i];
                i++;
            } else {
                student++;
                readPage = 0;
            }

            if(student > nos) {
                return false;
            }
        }
        return true;
    }
}

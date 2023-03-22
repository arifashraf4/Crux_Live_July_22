package Contest01;

import java.util.Scanner;

public class Hackathon1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] S = new int[n];
        for(int i = 0; i < S.length; i++) {
            S[i] = sc.nextInt();
        }

        isIncOrDec(S, n);
    }

    public static void isIncOrDec(int[] S, int n) {
        int count = 1;
        int i = 0;

        while((i < S.length - 1) && (S[i] > S[i + 1])) {
            count++;
            i++;
        }

        while((i < S.length - 1) && (S[i] < S[i + 1])) {
            count++;
            i++;
        }

        if(count == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

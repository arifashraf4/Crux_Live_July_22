package Contest01;

import java.util.Scanner;

public class Piyush_and_Magical_Park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        char[][] arr = new char[N][M];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        int ans = escaped(arr, K, S);

        if(ans >= K) {
            System.out.println("Yes");
            System.out.println(ans);
        } else {
            System.out.println("No");
        }
    }

    public static int escaped(char[][] arr, int K, int S) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j] == '.') {
                    S-=2;
                } else if(arr[i][j] == '*') {
                    S+= 5;
                } else if(arr[i][j] == '#'){
                    break;
                }
                if(j < arr[0].length - 1) {
                    S--;
                }
            }
        }

        return S;
    }
}

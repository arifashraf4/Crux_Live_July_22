package Contest01;

import java.util.Scanner;

public class Find_Square_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = squareRoot(n);
        System.out.println(ans);
    }

    public static int squareRoot(int x) {
        int i = 1;
        int floor = i;
        while(i * i <= x) {
            if(i * i == x) {
                return i;
            }
            floor = i;
            i++;
        }
        return floor;
    }
}

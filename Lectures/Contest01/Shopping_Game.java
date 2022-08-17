package Contest01;

import java.util.Scanner;
//Question is not explained properly.
//After every turn,sum of aayush and harshit should be lower than their limits respectively.(Not mentioned)
public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int i = 1;

        while (i <= T) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int turn = 1;
            int aayush = 0;
            int harshit = 0;
            while (true) {
                aayush += 2 * turn - 1;
                if (aayush > M) {
                    System.out.println("Harshit");
                    break;
                }
                harshit += 2 * turn;
                if (harshit > N) {
                    System.out.println("Aayush");
                    break;
                }
                turn++;
            }
            i++;
        }
    }
}
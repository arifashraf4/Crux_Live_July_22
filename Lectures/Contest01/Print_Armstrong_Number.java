package Contest01;

import java.util.Scanner;

public class Print_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        while (n1 <= n2) {
            int armstrong = armstrongNumber(n1);
            if(n1 == armstrong) {
                System.out.println(armstrong);
            }
            n1++;
        }
    }

    public static int armstrongNumber(int n) {
        int ans = 0;
        int cod = countofdigit(n);
        while (n > 0) {
            int rem = n % 10;
            ans = (int) (ans + Math.pow(rem, cod));
            n = n / 10;
        }
        return ans;
    }

    public static int countofdigit(int n) {
        int sum = 0;
        while(n > 0) {
            n = n / 10;
            sum++;
        }
        return sum;
    }
}

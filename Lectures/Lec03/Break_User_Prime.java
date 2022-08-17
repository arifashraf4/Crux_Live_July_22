package Lec03;

import java.util.Scanner;

public class Break_User_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        int fact = 0;

        while(i < n) {
            if(n % i == 0) {
                fact++;
                break;
            }
            i++;
        }

        if(fact > 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}

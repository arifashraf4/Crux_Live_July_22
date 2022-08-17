package Contest01;

import java.util.Scanner;

public class Fahrenheit_To_Celsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        int step = sc.nextInt();

        while (min <= max) {
            int celsius = (5*(min - 32))/9;
            System.out.println(min + "\t" + celsius);
            min += step;
        }
    }
}

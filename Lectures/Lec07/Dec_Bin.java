package Lec07;

public class Dec_Bin {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;
        int mul = 1;

        while (n > 0) {
            int rem = n % 2;
            sum = sum + rem * mul;
            n = n / 2;
            //Preparation for next loop
            mul = mul * 10;
        }
        System.out.println(sum);
    }
}

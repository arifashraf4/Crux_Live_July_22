package Lec25;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        String src = "A";
        String help = "B";
        String des = "C";
        int n = 3;
        toh(n, src, help, des);
    }

    public static void toh(int n, String src, String help, String des) {
        if (n == 0) {
            return;
        }
        toh(n - 1, src, des, help);
        System.out.println("Move " + n + " th disc from " + src + " to " + des);
        toh(n - 1, help, src, des);
    }
}

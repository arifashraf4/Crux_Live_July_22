package Lec08;

public class Function_Demo_3 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        addition(a, b);
        System.out.println(a);
    }

    public static void addition(int a, int b) {
        int c = a + b;
        a = a + 9; // This doesnt affect the main functions a variable
        System.out.println(c);
    }
}

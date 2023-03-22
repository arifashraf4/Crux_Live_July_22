package Lec36;

public class Method_Overloading {
    public static void main(String[] args) {
        System.out.println(add(2,4));
        System.out.println(add(2,4, 9));
        System.out.println(add(2,4, 9.6f));
        System.out.println(add(2,4, 9, 5, 2, 1, 5, 6, -20, 15, 5));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static int add(int a, int b, float c) {
        return (int) (a + b + c);
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    //variable no. of arguments
    //Only 1 variable no.of arguments is allowed
    public static int add(int x, int... a) { //variable no.of argument cannot be written in the middle or at the start
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

}

package Lec08;

//Prints -2 -> 20 -> 13 -> End of program execution
public class Function_Demo_1 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        addition();
        int c = a + b;
        System.out.println(c);
    }

    public static void addition() {
        int a = 9;
        int b = 11;
        int c = a + b;
        sub();
        System.out.println(c);
    }

    public static void sub() {
        int a = 9;
        int b = 11;
        int c = a - b;
        System.out.println(c);
    }
}

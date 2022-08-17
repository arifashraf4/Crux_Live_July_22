package Lec08;

//Prints the return type of a function
public class Function_Demo_2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = a + b;
        System.out.println(c);
        int d = addition();
        System.out.println(d);
        //Or
        System.out.println(addition());
    }

    public static int addition() {
        int a = 9;
        int b = 11;
        int c = a + b;
        return c;
    }
}

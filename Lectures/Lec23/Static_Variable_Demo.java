package Lec23;

public class Static_Variable_Demo {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println(val);
        fun();
        System.out.println(val);
    }

    public static void fun(){
        System.out.println("hey");
        val = val - 5;
        System.out.println(val);
        int val = 50;
        Static_Variable_Demo.val = Static_Variable_Demo.val + 6;
        System.out.println(val);

    }
}

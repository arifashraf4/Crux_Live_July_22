package Lec02;

//import java.util.Scanner - By default we get this code when you try to take input in code
import java.util.*; // * can be used to access all files in a package


public class User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

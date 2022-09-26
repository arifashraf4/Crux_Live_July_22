package Lec16;

import java.util.Scanner;

public class String_Demo {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Hello";
        String s2 = "Bye";
        String s3 = "hello";
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        String s4 = new String("hellohello");
        String s5 = s + s1;
        System.out.println(s5);

        String s6 = "hello" + "hello";
        String s7 = "hello" + "hello";
        System.out.println(s6 == s4);

    }
}

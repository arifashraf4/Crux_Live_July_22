package Lec07;

import java.util.Scanner;

public class Double_Float {
    public static void main(String[] args) {
        double d = 898.8901;
        System.out.println(d);
//        float f = 6.8; // Compiler Error: literal type is double for decimal numbers
        float f = 6.8f; // Or float(6.8)
        System.out.println(f);

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        long a1 = sc.nextLong();
//        double d1 = sc.nextDouble();
//        float f1 = sc.nextFloat();
        //byte b = sc.nextByte();
        //short s = sc.nextShort();

//        System.out.println(a);
//        System.out.println(a1);
//        System.out.println(d1);
//        System.out.println(f1);
        System.out.println(Double.MAX_VALUE);

//        boolean bol = true;
//        boolean bol1 = false;
//        bol = sc.nextBoolean();
//        System.out.println(bol);
    }
}

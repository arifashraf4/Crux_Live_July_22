package Lec16;

import java.util.Scanner;

public class String_Input {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        //Prints only the first word before space
        String s = sc.next();
        System.out.println(s);
        //Prints the whole line
        String s1 = sc.nextLine();
        System.out.println(s1);

        String s3 = "HelloByeokeyHey";
        System.out.println(s3.length());
        System.out.println(s3.charAt(2));
        String s4 = "HelloByeokeyHey";
        System.out.println(s3.equals(s4));

        String s5 = "ram";
        String s6 = "raju";
        System.out.println(s5.compareTo(s6)); // s5 > s6: +ve or s6 > s5: -ve or s5 == s6: 0

        String ss = s3.substring(2);
        System.out.println(ss);
        System.out.println(s3.substring(0,7));
    }
}

package Lec07;

public class Type_Casting {
    public static void main(String[] args) {
        byte b = (byte) (129);
        System.out.println(b);
        int i = 300;
        short b1 = (byte)(i); // Prints 44 - Error: 10kg ko 5 kg meh put karne pe error diya hence Type Cast kara
        short b2 = (short)(i); // Prints 300

        byte b3 = 14;
        int i2 = b3; //No Error: 5 kg ko 10 kg meh put karne pe error nhi de raha h
        System.out.println(b1);
        System.out.println(i2);

        long x = 6456456452L;
        int ll1 = 2147483647;
        int l2 = 6;
//        long c = ll1 + l2; //Out of range so will give us a random value
        long c = (long)(ll1) + (long)(l2);
        System.out.println(c);
    }
}

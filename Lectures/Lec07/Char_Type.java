package Lec07;

public class Char_Type {
    public static void main(String[] args) {
        char ch = 'a';
        int i = (int)(ch);
        //Number to ASCII Value using char
        int i2 = 120;
        char ch2 = (char) (i2);
        System.out.println(ch2);
        ch++;  //(Internal Type Casting of 32 bit int to 16 bit char as 1 is added)
        System.out.println(ch);
        ch = (char) (ch + 1); //Return the next character = c
        System.out.println(ch);
    }
}

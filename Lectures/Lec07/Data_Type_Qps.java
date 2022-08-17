package Lec07;

public class Data_Type_Qps {
    public static void main(String[] args) {
        for (byte b = 0; b <= 127;) {
            System.out.println(b);
            if(b == Byte.MAX_VALUE) {
                break;
            }
            b++;
        }


    }
}

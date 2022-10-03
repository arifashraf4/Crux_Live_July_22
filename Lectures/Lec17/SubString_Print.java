package Lec17;

public class SubString_Print {
    public static void main(String[] args) {
        String str = "Sayeed";
        printSubString(str);
    }

    public static void printSubString(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

}

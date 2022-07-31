package Lec02;

public class Loop_Demo {
    public static void main(String[] args) {
//        int i = 1;
//        int sum = 0;
//        while(i<=5) {
//            sum = sum + i;
//            i++;
//        }
//        System.out.println(sum);

        incrementOperator();
    }

    static void incrementOperator() {
        int i = 0;
        int ans = i;
        System.out.println(ans);
        i++;
        ans = i;
        System.out.println(ans);
        ans = ++i;
        System.out.println(ans);

    }
}

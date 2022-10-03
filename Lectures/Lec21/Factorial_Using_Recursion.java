package Lec21;

public class Factorial_Using_Recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    public static int fact(int n) {
        //1st Approach
        if(n == 0) {
            return 1;
        }
        int fn = fact(n - 1);
        return n * fn;
        //OR
//        return n * fact(n - 1);


//        //2nd Approach
//        while (n > 0) {
//            int fn = fact(n - 1);
//            return n * fn;
//        }
//        return 1;
    }
}

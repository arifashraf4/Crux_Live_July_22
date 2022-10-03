package Lec17;

public class CB_Number {
    public static void main(String[] args) {
        String str = "692239";
        printSubString(str);
    }

    public static void printSubString(String str) {
        int count = 0;
        boolean[] vis = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                String s = str.substring(i, j);
//                System.out.println(s); // Prints Substrings length wise
//                Integer.parseInt(s); // Numeric String gets converted to Integer
//                Long.parseLong(s);// Numeric String gets converted to Long
                if (isCBNumber(Long.parseLong(s)) == true && isVisited(vis, i , j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        vis[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isVisited(boolean[] vis, int i, int j) {
        for (int k = i; k <= j; k++) {
            if (vis[k] == true) {
                return false;
            }
        }
        return true;
    }

    public static boolean isCBNumber(long n) {
        if (n == 0 || n == 1) {
            return false;
        }

        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (n % arr[i] == 0) {
                return false;
            }
        }

        return true;
    }
}

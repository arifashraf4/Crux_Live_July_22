package Lec09;

public class Array_Demo_2 {
    public static void main(String[] args) {
         int[] arr = new int[]{ 1, 2, 3, 4, 5, 6 }; //Hardcoded array input values
//        System.out.println(arr.length);
//        display(arr);

        System.out.println(arr[0] + " " + arr[1]);
        swap(arr[0], arr[1]);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // 0 to n-1
            System.out.print(arr[i] + " ");
        }
    }
}

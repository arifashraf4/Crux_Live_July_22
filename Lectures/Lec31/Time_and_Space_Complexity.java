package Lec31;

public class Time_and_Space_Complexity {
    public static void main(String[] args) {
        //Program's Start Time
//        long start = System.currentTimeMillis();
//        for (int i = 1; i < 1000_00; i++) {
//
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        //O(1)
        System.out.println("Java padhna to Manu Bhaiya se, 29 Oct se Noide me  ");
        System.out.println("hey");


    }

    //O(n)
    public static int linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return i;
            }
        }

        return -1;
    }
}

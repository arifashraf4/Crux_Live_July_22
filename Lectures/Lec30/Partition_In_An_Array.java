package Lec30;

public class Partition_In_An_Array {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 3, 8, 9, 1, 4};
        System.out.println(partition(arr, 0, arr.length - 1));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int[] arr, int si, int ei) {

        int item = arr[ei];
        int pi = si;

        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                //Swap(pi, i)
                int temp = arr[i];
                arr[i] = arr[pi];
                arr[pi] = temp;
                pi++;
            }
        }

        //Swap(pi, ei) - Swap items Current Position(Last Index) with the pivot index(Final Position)
        int temp = arr[ei];
        arr[ei] = arr[pi];
        arr[pi] = temp;

        return pi;
    }
}

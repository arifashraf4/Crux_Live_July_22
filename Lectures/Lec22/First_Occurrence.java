package Lec22;

public class First_Occurrence {
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 5, 3, 7};
        int item = 5;
        int i = 0;

        System.out.println(findIndex(arr, item, i));
    }

    public static int findIndex(int[] arr, int item, int i) {
        //base condition: To check if index is in range
        if (i == arr.length) {
            return -1;
        }
        //base condition: if the item exists at value of arr[i]
        if (arr[i] == item) {
            return i;
        }

        return findIndex(arr, item, i + 1);
    }

}

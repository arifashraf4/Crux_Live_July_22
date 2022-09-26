package Lec11;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, -7, 4, 8, 2};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr) {

        for (int turn = 1; turn < arr.length; turn++) {
            for (int i = 0; i < arr.length - turn; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    //In the inner loop there is no swapping made we can say that it is sorted
    public static void SortOpti(int[] arr) {
        for (int turn = 1; turn < arr.length; turn++) {
            boolean flag = false;
            for (int i = 0; i < arr.length - turn; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }
    }

}

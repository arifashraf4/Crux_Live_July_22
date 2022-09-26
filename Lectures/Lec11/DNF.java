package Lec11;

//Dutch National Flag - Sorting Technique
public class DNF {
    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int k = 0;

        while (k <= j) {
            if(arr[k] == 2) {
                //Swap j & k
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;

                j--;
            } else if(arr[k] == 0) {
                //Swap i & k
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;

                i++;
                k++;
            } else {
                k++;
            }
        }

    }
}

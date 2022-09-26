package Lec10;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {11,33,42,64,-3};

//        System.out.println(linearSearch(arr, n));

//        //Linear Search without function
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] == n) {
//                System.out.println(i);
//                return; // Using return exits the main function hence sout(-1) doesnt execute
//                //Do not use break as this doesn't exit the main function(Program doesn't end)
//                //Hence, sout(-1) will be printed
//                //break;
//            }
//        }
//        System.out.println(-1);
    }

//    public static int linearSearch(int[] arr, int target) {
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
}

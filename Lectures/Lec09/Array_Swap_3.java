package Lec09;

import java.sql.SQLOutput;

/*
    JAVA Call By Value explanation using Function Example
 */
public class Array_Swap_3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] other = {100, 200, 300, 400};

        System.out.println("Before Swap: Call by Value Example Code Output:");
        System.out.println(arr[0] + " " + other[0]);
        swap(arr, other);
        System.out.println("After After: Call by Value Example Code Output:");
        System.out.println(arr[0] + " " + other[0]);

        /*
        arr = 2K
        other = 4K

        temp = 2K
        arr = 4K
        other = temp(2K)
        */

    /*
    Note: If array is swapped the memory addresses are swapped.
    JAVA is call by value hence if you want to make the values change outside the local scope(for everyone),
    you'll have to change the values inside the array indexes.
    */

    //For understanding purpose: (Was not taught in the call)
    //What happens if you change and print in that scope(main/glo scope, function scope)? Ans in code below
    //Prints the address of both the arrays
        System.out.println("Swapping array memory address & index values in the Global Scope Output:");
        System.out.println(arr);
        System.out.println(other);

        //Swapping two whole arrays. Works because we are printing the swapped values in the same scope
        System.out.println(arr[0] + " " + other[0]);
        int[] temp = arr;
        arr = other;
        other = temp;
        System.out.println(arr[0] + " " + other[0]);

        //After swapping arrays memory addresses also swap
        System.out.println(arr);
        System.out.println(other);
    }

    //Swap function - To understand if arrays swap outside the local scope or not if changes made inside
    //Ans - They don't swap outside the local scope
    public static void swap(int[] arr, int[] other) { //Takes an arr, arr index i, arr index j
        // These arrays point to the same memory address as the one in the global scope
        System.out.println("Swapping Array Memory Address Function Code Output:");
        System.out.println(arr);
        System.out.println(other);

        int[] temp = arr;
        arr = other;
        other = temp;

        System.out.println(arr);
        System.out.println(other);
    }
}

package Lec19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        System.out.println(a);

        System.out.println(a.size());
        //How to add elements
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        //add at index - Range of arraylist is 0 to size()
        a.add(1, -5);
        a.add(0, 8);
        System.out.println(a);

        //remove
        System.out.println(a.remove(2));
        System.out.println(a);

        //set
        a.set(2, -7);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        Collections.reverse(a);
        System.out.println(a);

        //To get elements
        System.out.println(a.get(2));

        int[] arr = new int[3];
        for (int v : arr) {
            System.out.print(v + " ");
        }

        System.out.println();

        for (int v: a) {
            System.out.print(v + " ");
        }


    }
}

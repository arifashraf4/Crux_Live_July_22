package Lec19;

import java.util.ArrayList;
import java.util.Collections;

public class Internal_Working_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(1,-5);
        a.add(0, 8);
        System.out.println(a);
    }
}

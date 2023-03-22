package Lec37;

import java.util.Stack;

public class Stack_Reverse {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(40);
        st.push(6);
        st.push(89);
        st.push(70);
        st.push(-2);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    private static void reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int item = st.pop();
        reverse(st);
//        st.push(item);
        insertDown(st, item);
    }

    private static void insertDown(Stack<Integer> st, int i) {
        if (st.isEmpty()) {
            st.push(i);
            return;
        }

        int item = st.pop();
        insertDown(st, i);
        st.push(item);
    }
}

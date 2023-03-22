package Lec35;

public class Stack {

    protected int[] arr;

    private int top;

    //Stack s = new Stack();
    //Stack s = new Stack(30);
    public Stack() {
        arr = new int[5];
        top = -1;
    }

    //cap - Capacity
    public Stack(int cap) {
        arr = new int[cap];
        top = -1;
    }

    public boolean isEmpty() {

        return top == -1;
    }

    public boolean isFull(){
        return top == arr.length - 1;
    }
    public void push(int item) throws Exception {
        if (isFull() == true) {
            throw new Exception("Stack Overflow");
        }
        top++;
        arr[top] = item;
    }

    public int pop() throws Exception {
        if (isEmpty() == true) {
            throw new Exception("Stack Underflow");
        }

        int val = arr[top];
        top--;
        return val;
    }

    public int peek() throws Exception {
        if (isEmpty() == true) {
            throw new Exception("Stack Underflow");
        }

        int val = arr[top];
        return val;
    }

    public int size() {

        return top + 1;
    }

    public void display() {

        for (int i = top; i >=0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

}

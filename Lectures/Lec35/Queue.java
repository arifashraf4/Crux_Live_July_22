package Lec35;

public class Queue {

    protected int []arr;
    protected int size;
    protected int front;


    public Queue() {
        this.arr = new int[5];
        this.size = 0;
        this.front = 0;
    }

    public Queue(int cap) {
        this.arr = new int[cap];
        this.size = 0;
        this.front = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public int size() {
        return size;
    }

    public void Enqueue(int item) throws Exception {
        if (isFull() == true) {
            throw new Exception("Queue is full");
        }
        int idx = (front + size) % arr.length;
        arr[idx] = item;
        size++;
    }

    public int Dequeue() throws Exception {
        if (isEmpty() == true) {
            throw new Exception("Queue is empty");
        }
        int val = arr[front];
        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    public int getFront() throws Exception {
        if (isEmpty() == true) {
            throw new Exception("Queue is empty");
        }
        int val = arr[front];
        return val;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % arr.length;
            System.out.print(arr[idx] + " ");
        }
        System.out.println();
    }
}

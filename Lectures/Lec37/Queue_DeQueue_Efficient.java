package Lec37;

import Lec35.Queue;

public class Queue_DeQueue_Efficient {

    private Dynamic_Stack ds = new Dynamic_Stack();

    public boolean isEmpty() {

        return ds.isEmpty();
    }

    public int size() {
        return ds.size();
    }

    public void enqueue(int item) throws Exception {

        Dynamic_Stack hlp = new Dynamic_Stack();
        while (!ds.isEmpty()) {

            hlp.push(ds.pop());
        }
        ds.push(item);

        while (!hlp.isEmpty()) {

            ds.push(hlp.pop());
        }
    }

    public int dequeue() throws Exception {
        return ds.pop();
    }

    public int getFront() throws Exception {
        return ds.peek();
    }

    public static void main(String[] args) throws Exception {
        Queue_DeQueue_Efficient qdf = new Queue_DeQueue_Efficient();
        qdf.enqueue(10);
        qdf.enqueue(20);
        qdf.enqueue(30);
        qdf.enqueue(40);
        qdf.enqueue(50);
        System.out.println(qdf.dequeue());
        System.out.println(qdf.dequeue());
        System.out.println(qdf.getFront());
        qdf.enqueue(60);
        qdf.enqueue(70);
        System.out.println(qdf.dequeue());
        System.out.println(qdf.getFront());
    }
}

package Lec37;

import Lec35.Queue;
import com.sun.security.jgss.GSSUtil;

public class Dynamic_Queue extends Queue {

    @Override
    public void Enqueue(int item) throws Exception {
        if (isFull()) {
            int [] newarr = new int[2 * arr.length];

            for (int i = 0; i < size; i++) {
                int idx = (front + i) % arr.length;
                newarr[i] = arr[idx];
            }
            arr = newarr;
            front = 0;
        }

        super.Enqueue(item);
    }

    public static void main(String[] args) throws Exception {
        Dynamic_Queue dq = new Dynamic_Queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        System.out.println(dq.Dequeue());
        System.out.println(dq.Dequeue());
        dq.Enqueue(50);
        dq.Enqueue(60);
        dq.Enqueue(70);
        dq.display();
        dq.Enqueue(80);
        dq.display();
    }

}

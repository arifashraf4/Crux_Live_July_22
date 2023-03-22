package Lec37;

public class Queue_Reverse {
    public static void main(String[] args) throws Exception {

        Dynamic_Queue dq = new Dynamic_Queue();
        dq.Enqueue(10);
        dq.Enqueue(20);
        dq.Enqueue(30);
        dq.Enqueue(40);
        dq.Enqueue(50);
        dq.display();
        reverse(dq);
        dq.display();

    }

    private static void reverse(Dynamic_Queue dq) throws Exception {
        if (dq.isEmpty()) {
            return;
        }

        int item = dq.Dequeue();
        reverse(dq);
        dq.Enqueue(item);
    }
}

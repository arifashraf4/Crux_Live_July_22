package Lec37;

public class Stack_Push_Efficient {
    private Dynamic_Queue dq = new Dynamic_Queue();

    public boolean isEmpty() {

        return dq.isEmpty();
    }

    public void push(int item) throws Exception {

        dq.Enqueue(item);
    }

    public int size() {
        return dq.size();
    }

    public int pop() throws Exception {
        Dynamic_Queue hlp = new Dynamic_Queue();
        while (dq.size() > 1) {
            hlp.Enqueue(dq.Dequeue());
        }
        int item = dq.Dequeue();
        dq = hlp;
        return item;

    }

    public int peek() throws Exception {
        Dynamic_Queue hlp = new Dynamic_Queue();
        while (dq.size() > 1) {
            hlp.Enqueue(dq.Dequeue());
        }
        int item = dq.Dequeue();
        hlp.Enqueue(item);
        return item;

    }
    public static void main(String[] args) throws Exception {
        Stack_Push_Efficient spf = new Stack_Push_Efficient();
        spf.push(10);
        spf.push(20);
        spf.push(30);
        spf.push(40);
        spf.push(50);
        System.out.println(spf.pop());
        System.out.println(spf.pop());
        System.out.println(spf.peek());
    }
}

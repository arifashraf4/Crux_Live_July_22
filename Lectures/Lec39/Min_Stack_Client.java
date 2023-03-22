package Lec39;

public class Min_Stack_Client {
    public static void main(String[] args) throws Exception {
        Min_Stack s = new Min_Stack();
        s.push(1);
        s.push(7);
        s.push(5);
        s.push(2);
        s.push(63);
        s.push(14);
        s.push(22);
        s.push(6);
        s.push(-3);
        s.display();
        System.out.println(s.min()); // -3
        System.out.println(s.pop()); // -3
        System.out.println(s.pop()); // 6
        System.out.println(s.peek()); // 22
        System.out.println(s.min()); // 1


    }
}

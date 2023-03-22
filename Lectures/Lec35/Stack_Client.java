package Lec35;

public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Peek/Top Element: " + s.peek());
        s.display();
        System.out.println("Pop: " + s.pop());
        s.display();
        System.out.println("Size of Stack: " + s.size());
        s.push(5);
        s.display();
//        s.push(6);
//        s.display();

    }
}

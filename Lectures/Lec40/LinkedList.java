package Lec40;

public class LinkedList {

    private class Node {
        int val;
        Node next;

    }

    private Node head; // Every LinkedList will know 1st Node Address
    private Node tail; // Every LinkedList will know last Node Address
    public int size; // Total No.of Nodes in LinkedList

    // O(1)
    public void addFirst(int item) {
        Node nn = new Node(); // Creates a New Node - Sets val = 0 and next = NULL
        nn.val = item;

        if(size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {

            nn.next = head;
            head = nn;
            size++;
        }
    }

    // O(1)
    public void addLast(int item) {

        if(size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node(); // Creates a New Node - Sets val = 0 and next = NULL
            nn.val = item;

            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addDataAtIndex(int k, int item) throws Exception {
        if (size == 0) {
            addFirst(item);
        } else if(k == size - 1) {
            addLast(item);
        } else {
            Node nn = new Node();
            nn.val = item;
            Node k_1th  = getNode(k - 1);
            nn.next = k_1th.next;
            k_1th.next = nn;
            size++;
        }
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " --> ");
            temp = temp.next;
        }
        System.out.println(".");
    }

    public int getFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is Empty");
        }

        return head.val;
    }

    public int getLast() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is Empty");
        }

        return tail.val;
    }

    public int getAtIndex(int k) throws Exception {
        return getNode(k).val;
    }

    public int removeFirst() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is Empty");
        }

        if (size == 1) {
            tail = null;
        }

        Node temp = head;
        head = head.next;
        size--;
        temp.next = null;

        return temp.val;
    }

    public int removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("LinkedList is Empty");
        }

        if (size == 1) {
            return removeFirst();
        } else {
            Node n = getNode(size - 2);
            Node temp = tail;
            tail = n;
            tail.next = null;
            size--;

            return temp.val;
        }
    }

    public int removeAtIndex(int k) throws Exception {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {
            Node curr = getNode(k);
            Node prev = getNode(k - 1);
            prev.next = curr.next;
            curr.next = null;
            size--;
            return curr.val;
        }
    }


    public Node getNode(int k) throws Exception {
        if (k < 0 || k >= size) {
            throw new Exception("Index Invalid");
        }
        Node temp = head;

        for (int i = 1; i <= k; i++) {
            temp = temp.next;
        }
//        //Second Approach for i:
//        for (int i = 0; i < k; i++) {
//            temp = temp.next;
//        }

        return temp;
    }
}

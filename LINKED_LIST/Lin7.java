//remove in link list 

public class Lin7 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addMid(int index, int data) {
        if (head == null) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void removeFirst() { // to remove first node
        if (size == 0) {
            System.out.println("LL is empty....");
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("Linkedlist is empty...........");
            return;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.print("List is empty..");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public static void main(String[] args) {
        Lin7 ll = new Lin7();
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addMid(2, 0);
        ll.addMid(3, 00);
        ll.addMid(3, 000);
        ll.addLast(11);
        ll.addLast(12);
        ll.addLast(13);

        ll.print();

        ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();

        System.out.println("Size of the linkedList==" + size);
    }
}
/*
 * 8 --> 9 --> 0 --> 0 --> 0 --> 10 --> 11 --> 12 --> 13 --> null
 * 9 --> 0 --> 0 --> 0 --> 10 --> 11 --> 12 --> 13 --> null
 * 9 --> 0 --> 0 --> 0 --> 10 --> 11 --> 12 --> null
 * Size of the linkedList==7
 */
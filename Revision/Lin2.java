//deletion in linked list 

import java.util.*;

class Lin2 {
    Scanner sc = new Scanner(System.in);

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int t;

    // insertion at head
    public void addFirst(int data) {
        Node newNode = new Node(data);
        t++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insertion of tail
    public void addLast(int data) {
        Node newNode = new Node(data);
        t++;
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

    // delete at head
    public void removeFirst() {
        t--;
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        head = head.next;
    }

    // delete at tail
    public void removeLast() {
        if (t == 0) {
            System.out.println("List is empty...");
            return;
        }
        Node temp = head;

        for (int i = 0; i < (t - 2); i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        t--;

    }

    public void removeIndex() {
        if (t == 0) {
            System.out.println("Empty linked list");
            return;
        }

        System.out.println("Enter the index no:");
        int p = sc.nextInt();
        Node temp = head;
        for (int i = 0; i < p - 1; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next.next;
        temp.next = temp1;
        t--;

    }

    public void removeMid() {
        if (t == 0) {
            System.out.println("Empty linked list...");
            return;
        }
        Node temp = head;
        for (int i = 0; i < (t / 2) - 1; i++) {
            temp = temp.next;
        }
        Node temp1 = temp.next.next;
        temp.next = temp1;
        t--;
    }

    // printing of linked list
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty ");
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
        Scanner sc = new Scanner(System.in);
        Lin2 ll = new Lin2();
        ll.addFirst(12);
        ll.addFirst(11);
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addFirst(8);
        ll.addFirst(7);
        ll.addLast(13);
        ll.addLast(14);
        ll.addLast(15);
        ll.addLast(16);
        ll.addLast(17);
        ll.print();
        System.out.println("The no of nodes = " + t);

        // ll.removeFirst();

        // ll.removeLast();
        // ll.removeIndex();
        ll.removeMid();
        ll.print();
        System.out.println("The no of nodes = " + t);

    }
}

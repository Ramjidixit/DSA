//printing the particular index value 

import java.util.*;

public class Lin3 {
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
    static int t;

    // inserting at first
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        t++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // inserting at last
    public void insertLast(int data) {
        Node newNode = new Node(data);
        t++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    // printing particular index value
    public void printIndex() {
        if (t == 0) {
            System.out.println("It is empty linked list..");
            return;
        }
        System.out.println("Enter the index value :");
        int p = sc.nextInt();

        Node temp = head;
        for (int i = 0; i < (p); i++) {
            temp = temp.next;
        }

        System.out.println("Node at this index=" + temp.data);
    }

    // printing whole linkedlist
    public void print() {
        if (t == 0) {
            System.out.println("List is empty..");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {

        Lin3 ll = new Lin3();
        ll.insertFirst(13);
        ll.insertFirst(12);
        ll.insertFirst(11);
        ll.insertLast(14);
        ll.insertLast(15);
        ll.insertLast(16);
        ll.print();
        ll.printIndex();
        System.out.println("The size of Linkedlist =" + ll.t);
    }

}

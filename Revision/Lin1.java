
//insertion opertion in node 
import java.util.*;

class Lin1 {
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

    // insertion in the speified position in Linkedlist
    public void insertPlace(int data) {
        Node newNode = new Node(data);
        t++;
        if (head == null) {
            head = newNode;
            return;
        }
        System.out.println("Enter position of node to be inserted:");
        int p = sc.nextInt();
        Node tem1 = head;
        for (int i = 0; i < (p - 1); i++) {
            tem1 = tem1.next;
        }
        newNode.next = tem1.next;
        tem1.next = newNode;

    }

    // insertion AT MIDDLE
    public void insertMid(int data) {
        Node newNode = new Node(data);
        t++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node tem1 = head;
        for (int i = 0; i < (t / 2) - 1; i++) {
            tem1 = tem1.next;
        }
        newNode.next = tem1.next;
        tem1.next = newNode;

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
        Lin1 ll = new Lin1();
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
        ll.insertMid(200);
        // ll.insertPlace(200);

        ll.print();
        System.out.println("The no of nodes = " + t);
    }
}

/*
 * 7 --> 8 --> 9 --> 10 --> 11 --> 200 --> 12 --> 13 --> 14 --> 15 --> 16 -->null
 * The no of nodes = 11
 */
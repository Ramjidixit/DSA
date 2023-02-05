//size of link list 

public class Lin6 {
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

        if (index == 0) {
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

    }

    public static void main(String[] args) {
        Lin6 ll = new Lin6();
        ll.addFirst(10);
        ll.addFirst(9);
        ll.addMid(2, 0);
        ll.addMid(3, 0);
        ll.addLast(11);
        ll.addLast(12);
        ll.print();
        System.out.println();
        System.out.println("Size of the linkedList==" + size);
    }
}
/*
 * 9 --> 10 --> 0 --> 0 --> 11 --> 12 --> null
 * Size of the linkedList==6
 */

//insert in the middle 

public class Lin5 {
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

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }

        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int index, int data) {
        if(index==0){
            insertFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public void insertLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
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
            System.out.println("List is empty....");
            return;

        }
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
        // System.out.println();
    }

    public static void main(String[] args) {
        Lin5 ll = new Lin5();
        ll.insertFirst(15);
        ll.insertFirst(14);
        ll.insertFirst(13);

        ll.print();
        ll.insertLast(16);
        ll.insertLast(17);
        ll.insertLast(18);

        ll.print();

        ll.insertMiddle(0, 0);
        ll.insertMiddle(3, 0);
        ll.insertMiddle(5, 0);

        ll.print();

    }

}
/*
 * 13 --> 14 --> 15 --> null
 * 13 --> 14 --> 15 --> 16 --> 17 --> 18 --> null
 * 13 --> 0 --> 14 --> 0 --> 15 --> 0 --> 16 --> 17 --> 18 --> null
 */
public class Lin1 {
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

    public void addFirst(int data) {

        // step 1 create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newNode next=head
        newNode.next = head;

        // step 3 head=newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        Node CurrNode = head;
        while (CurrNode.next != null) {
            CurrNode = CurrNode.next;

        }
        CurrNode.next = newNode;

    }

    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty Link list");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Lin1 ll = new Lin1();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        ll.addLast(26);
        ll.addLast(36);
        ll.addLast(28);

        ll.print();

    }

}
//inserting element at last in linkedlist 

public class Link5 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;

        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = n;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node p = head;
            while (p != null) {
                System.out.print(p.data + "->");
                p = p.next;
            }
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Link5 l = new Link5();
        l.addLast(45);
        l.addLast(35);
        l.addLast(39);
        l.printList();
    }
}

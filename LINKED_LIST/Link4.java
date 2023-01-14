//adding element at first 

public class Link4 {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.data + "-> ");
                currNode = currNode.next;
            }
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Link4 list = new Link4();
        list.addFirst(15);
        list.addFirst(16);
        list.printList();
    }
}
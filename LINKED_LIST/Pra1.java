public class Pra1 {
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
        Node p = new Node(data);
        if (head == null) {
            head = p;

        } else {
            p.next = head;
            head = p;
        }
    }

    public void addLast(int data) {
        Node q = new Node(data);
        if (head == null) {
            head = q;
        } else {
            Node s = head;
            while (s.next != null) {
                s = s.next;
            }
            s.next = q;
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty.");
        } else {
            Node s = head;
            while (s != null) {
                System.out.print(s.data + "->");
                s = s.next;
            }
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        Pra1 p = new Pra1();
        p.addFirst(25);
        p.addFirst(96);
        p.addFirst(63);
        p.addLast(26);
        p.printList();
        p.addLast(96);
        p.addLast(46);
        p.printList();
    }

}
/*
 * 63->96->25->26->null
 * 63->96->25->26->96->46->null
 */
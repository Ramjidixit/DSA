//doubly linked list 

public class Dl1 {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void print(){
        if(head==null){
            System.out.println("LL is empty..");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <--> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
        
    
    public static void main(String[] args) {
        Dl1 ll=new Dl1();
        ll.addFirst(10);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.print();
        System.out.println("Size=="+size);
    }
    
}

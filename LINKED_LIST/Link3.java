class Link3 {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }else{
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
    }

        System.out.println("null");
    }
    public static void main(String[] args) {
        Link3 list=new Link3();
        list.addFirst("a");
        list.addFirst("is");

        list.printList();
        list.addLast("list ");

        list.addFirst("this");

        list.printList();
    }
}

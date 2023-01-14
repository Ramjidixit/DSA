//type declaration for link list 

public class Link1 {
    private int data;
    private Link1 next;

    public Link1(int data) {
        this.data = data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Link1 next) {
        this.next = next;
    }

    public Link1 getNext() {
        return this.next;
    }
}

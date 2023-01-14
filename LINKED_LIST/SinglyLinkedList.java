
public class SinglyLinkedList {
	Node head;
	Node tail;

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public void addEnd(int x) {
		Node p = new Node(x);
		if (head == null) {
			head = tail = p;
		} else {
			tail.next = p;
			tail = p;
		}

	}

	public void display() {
		Node p = head;
		while (p != null) {
			System.out.print(p.data + " ->");
			p = p.next;
		}
		System.out.println();
	}

	public void addFirst(int x) {
		Node p = new Node(x);
		if (head == null) {
			head = tail = p;
		} else {
			p.next = head;
			head = p;
		}
	}

	public void insertAt(int pos, int data) {
		Node node = new Node(data);
		Node p = head;
		int count = 1;
		while (count < pos - 1) {
			p = p.next;
			count++;
		}
		node.next = p.next;
		p.next = node;
	}

	public int length() {
		Node p = head;
		int count = 0;

		while (p != null) {
			count++;
			p = p.next;

		}
		return count;
	}

	public void delete(int index) {

	}

	public Node find(int data) {
		Node p = head;

		while (p != null) {
			if (p.data == data) {
				return p;
			}
			p = p.next;
		}
		return null;
	}

	public void findAt(int i) {
		if (head == null || i <= 0) {
			throw new IllegalArgumentException("Not a Valid data");
		}
		Node p = head;
		int count = 1;
		while (count < i) {
			p = p.next;
			count++;
		}
		System.out.println("data = " + p.data);
	}

	public void insertAt(int i) {
		Node p = new Node(50);

	}

	public static void main(String[] args) {
		SinglyLinkedList slLinkedList = new SinglyLinkedList();
		slLinkedList.addEnd(10);
		slLinkedList.addEnd(20);
		slLinkedList.addEnd(30);
		slLinkedList.addFirst(555);
		int c = slLinkedList.length();
		slLinkedList.display();
		System.out.println("length : " + c);

		if (slLinkedList.find(30) != null) {
			System.out.println("Node Found");
		} else {
			System.out.println("Node not Found");
		}

		slLinkedList.findAt(3);
	}
}
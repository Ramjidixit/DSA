import java.util.*;

public class Link2 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        System.out.println(l1);
        l1.addFirst("D");
        System.out.println(l1);
        l1.addLast("x");
        System.out.println(l1);
        l1.remove("B");
        System.out.println(l1);
        l1.add(2, "y");
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
    }
}
/*
 * [A, B, C]
 * [D, A, B, C]
 * [D, A, B, C, x]
 * [D, A, C, x]
 * [D, A, y, C, x]
 * [D, A, y, x]
 */
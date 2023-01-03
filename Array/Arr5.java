//search the element in the given array  and print its index no otherwise print -1

import java.util.*;

class Arr {
    Scanner sc = new Scanner(System.in);

    void display() {
        int[] num = { 8, 56, 9, 7, 3, 56, 48, 9 };
        int in = -1;

        System.out.println("Enter the number:");
        int a = sc.nextInt();
        for (int i = 0; i < num.length; i++) {
            if (a == num[i]) {
                in = i;
                break;
            }
        }
        if (in == -1) {
            System.out.println("-1");
        } else {
            System.out.println("the element " + a + " found at " + in);
        }
    }
}

public class Arr5 {
    public static void main(String[] args) {

        Arr b = new Arr();
        b.display();
    }

}

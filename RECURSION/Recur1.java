//print number from n to 1

import java.util.*;

public class Recur1 {
    public static void display(int n) {

        if (n == 0) {
            return;
        }
        System.out.println(n);
        display(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = sc.nextInt();
        System.out.println("---------------");
        display(n);
    }
}
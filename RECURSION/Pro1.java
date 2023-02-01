//print number from n to 1

import java.util.*;

public class Pro1 {
    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("-----------------------------------");
        print(n);

    }
}
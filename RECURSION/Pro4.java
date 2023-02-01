//print the factorial of a number 

import java.util.*;

public class Pro4 {
    public static int print(int n) {
        if (n == 0) {
            return 1;
        }
        int r = print(n - 1);
        int q = n * r;
        return q;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("--------------------");

        System.out.println("Factorial of a number=" + print(n));
    }
}

// time complexity and space complexity==O(n)

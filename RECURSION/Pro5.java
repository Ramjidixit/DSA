//print sum of first n natural number 

import java.util.*;

public class Pro5 {
    public static int print(int n) {
        if (n == 1) {
            return 1;
        }
        int q = print(n - 1);
        int r = n + q;
        return r;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Result=" + print(n));
    }

}

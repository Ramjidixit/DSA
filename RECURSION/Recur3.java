//print sum of first n natural number 

import java.util.*;

public class Recur3 {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return (n + sum(n - 1));
    }

    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("______________________________________________________");
        System.out.println("The sum of n natural number:" + sum(n));

    }
}

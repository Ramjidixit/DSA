//print nth fibonacci number

import java.util.*;
public class Pro6 {
    public int print(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int f1=print(n-1);
        int f2=print(n-2);
        return f1+f2;
    }
    public static void main(String[] args) {
        Pro6 p=new Pro6();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n th term :");
        int n=sc.nextInt();
        System.out.println("Nth term =="+p.print(n));
    }
}

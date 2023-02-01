//print number from n to 1(decreasing order)

import java.util.*;
public class Pro3 {
    public static void print(int n){
        if(n==1){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("----------------------");
        print(n);
    }
    
}

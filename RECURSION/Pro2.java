//print number from 1 to n

import java.util.*;
public class Pro2{
    
    public static void print(int n){
        
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("------------------");
        
        print(n);
    }
}
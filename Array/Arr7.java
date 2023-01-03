
//taking array input from user 
import java.util.*;

class Arr {
    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        System.out.println("-----------------");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

public class Arr7 {
    public static void main(String[] args) {
        Arr p = new Arr();
        p.display();
    }

}

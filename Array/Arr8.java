//program of linear search in java 

import java.util.*;

public class Arr8 {
    public static int linearSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println("Enter the number which u want to search ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int index = linearSearch(arr, num);
        if (index == -1) {
            System.out.println("Not found");

        } else {
            System.out.println("Number is at index " + index);
        }
    }
}

// program of largest number in an given array

class Arr8 {
    public static void max(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element =" + max);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 45, 87, 96, 36, 54 };
        max(arr);
    }

}


//program to reverse the elements of an array 
         //this method takes more space so its not the most optimize way 
class Arr8 {
    public static void reverse(int arr[]) {
        int num = arr.length;

        for (int i = num - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
    }
}
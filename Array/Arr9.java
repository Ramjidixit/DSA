// Binary search in array 
import java.util.*;


public class Arr9 {
    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        int key = 22;

        System.out.println("Index for key is : "+binarySearch(arr,key));
    }

}

//reverse an array 
     //best method by swapping 

public class Arr9{
    public static void reverse(int numbers[]){
        int first=0,last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;


            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        reverse(numbers);

        //printing arrray 
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }



}

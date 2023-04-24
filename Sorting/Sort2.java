// Selection sort--pick the smallest from the unsorted array and put it 
// at the begining

//Selection sort 
//in ascending order
// import java.util.*;
// public class Sort2{
//     public static void selectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int minPos=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos=j;
//                 }
//             }
//             int temp=arr[minPos];
//             arr[minPos]=arr[i];
//             arr[i]=temp;
//         }
//     }
//     public static void print(int [] arr){
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
//     public static void main(String[] args) {
//         int [] arr={1,5,9,3,2,6,4,7};
//         selectionSort(arr);
//         print(arr);
//     }
// }
//1 2 3 4 5 6 7 9 

//in descending order
import java.util.*;
public class Sort2{
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos] < arr[j]){
                    minPos=j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,5,9,3,2,6,4,7};
        selectionSort(arr);
        print(arr);
    }
}
//9 7 6 5 4 3 2 1 
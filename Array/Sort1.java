// Bubble sort--large elements come to the end of array by swapping with adjacent elements
import java.util.*;
class Sort1{
    
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Ist method
        int arr[]={1,6,4,8,9,7,2,3,5};
        // Taking user input manually 
        // System.out.println("Enter the number of elements in the array:");
        // int m=sc.nextInt();
        // int arr[]=new int[m];
        // for(int l=0;l<arr.length;l++){
        //     arr[l]=sc.nextInt();
        // }
        bubbleSort(arr);
        printArr(arr);


    }

    

}
// time complexity is O(n^2)
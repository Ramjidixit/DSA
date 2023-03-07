//printing subarray of an array -- a continuous part of array 

public class Arr11 {
    public static void subArray(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {

                    sum = sum + arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.print("  sum=" + sum);
                total++;
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Total subarrays=" + total);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        subArray(arr);
    }
}

// no of subarrays=(n(n+1))/2 where n is the number of elements
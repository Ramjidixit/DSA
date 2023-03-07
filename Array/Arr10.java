//pairs in an array--search all possible pairs in an data

public class Arr10 {
    public static void printPairs(int arr[]){
        int total=0;
        for(int i=0;i<arr.length;i++ ){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print(" ("+current+","+arr[j]+") ");
                total++;
            }
            System.out.println();
        }
        System.out.println("No of total pairs= "+total);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printPairs(arr);

    }
}

//no of total pairs==(n*(n-1))/2



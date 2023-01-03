//pw homework questions 

//Given an array of integers {2, 6, -5, -1, 0, 4, -9}, print only the positive values present in the array.
/* 
class Arr {
    public void display() {
        int[] arr = { 2, 6, -5, -1, 0, 4, -9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class Arr6 {
    public static void main(String[] args) {
        Arr a = new Arr();
        a.display();
    }
}

//Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all strings stored on odd indices of the array
class Arr{
    void disp(){
        String[] arr={"ab","bc","cd","de","ef","fg","gh"};
        for(int i=0;i<arr.length;i++){
            if(i % 2==1 || i==1){
                System.out.println(arr[i]);

            }
        }
    }
}
class Arr6{
    public static void main(String[] args) {
        Arr a=new Arr();
        a.disp();
    }
}

//Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements. 
class Arr{
    
    void disp(){
        int[] arr={1,2,3,4,5,6,7,8};
        for(int k:arr){
            if(k%2==0){
                System.out.println(k);
            }
        }
    }
}
class Arr6{
    public static void main(String[] args) {
        Arr a=new Arr();
        a.disp();
    }
}

//Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element
class Arr {
    void disp() {

        int[] arr = { 2, -3, 5, 8, 1, 0, -4 };
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("The minimum element=" + min);
    }
}

class Arr6 {
    public static void main(String[] args) {
        Arr a = new Arr();
        a.disp();
    }
}*/

/*Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. 
Leftmost and rightmost element cannot be a peak element.*/

class Arr {
    void display() {
        int[] arr = { 1, 1, 3, 4, 2, 3, 5, 7, 0 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("The max element=" + max);
    }
}

class Arr6 {
    public static void main(String[] args) {
        Arr a = new Arr();
        a.display();
    }
}
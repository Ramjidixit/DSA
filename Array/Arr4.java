//max of array 
class Array1 {

    void display() {
        // initialiazing array
        int[] age = { 89, 48, 30, 98, 25 };
        int ans = 0;
        for (int i = 0; i < age.length; i++) {
            if (age[i] > ans) {
                ans = age[i];
            }
        }
        System.out.println("max=" + ans);  //max=98

    }

}

public class Arr4 {
    public static void main(String[] args) {
        Array1 a = new Array1();
        a.display();
    }
}
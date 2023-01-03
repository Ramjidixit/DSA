//array initialization 

class Array1 {

    // initialiazing array
    int[] age = { 10, 20, 30, 40, 50 };

    void display() {
        System.out.println(age[0]); // 10
        System.out.println(age[1]); // 20
        System.out.println(age[2]); // 30
        System.out.println(age[3]); // 40
        System.out.println(age[4]); // 50
    }

}

public class Arr1 {
    public static void main(String[] args) {
        Array1 a = new Array1();
        a.display();
    }
}
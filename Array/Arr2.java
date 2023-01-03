//array initialization,no of elements,array traversing 

class Array1 {

    void display() {
        // initialiazing array
        int[] age = { 10, 20, 30, 40, 50 };
        // another method
        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 85;
        marks[2] = 86;

        // measuring length-taking no of elements
        System.out.println(age.length); // 5
        System.out.println(marks.length); // 3

        // array traversing-using for loop,for each loop, while loop

        // using for loop
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }

        // using for each loop
        for (int k : age) {
            System.out.println(k);
        }

        // using while loop
        int i = 0;
        while (i < age.length) {
            System.out.println(age[i]);
            i++;
        }
    }

}

public class Arr2 {
    public static void main(String[] args) {
        Array1 a = new Array1();
        a.display();
    }
}
//sum and multiplication of array
class Array1 {

    void display() {
        // initialiazing array
        int[] age = { 10, 20, 30, 40, 50 };
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }
        System.out.println("Sum=" + sum);

        int mul = 1;
        for (int i = 0; i < age.length; i++) {
            mul = mul * age[i];
        }
        System.out.println("Multipliaction=" + mul);

    }

}

public class Arr3 {
    public static void main(String[] args) {
        Array1 a = new Array1();
        a.display();
    }
}
//Tower of Hanoi for 3 Towers 

public class Recur4 {
    public static void TowerOfHanoifun(int n, String a, String b, String c) {
        if (n == 1) {
            System.out.println("Move 1-th Disk from " + a + " TO " + c);
            return;
        }
        TowerOfHanoifun(n - 1, a, c, b);
        System.out.println("Move " + n + "-th Disk From " + a + " To " + c);
        TowerOfHanoifun(n - 1, b, a, c);

    }

    public static void main(String[] args) {
        System.out.println("Hello");
        TowerOfHanoifun(3, "A", "B", "C");
    }
}
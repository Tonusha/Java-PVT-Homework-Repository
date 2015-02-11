package Hw3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task10 {
    public static void main(String[] args) {
        int x = 7;
        int simple = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                simple++;
            }
        }
        if (simple == 2) {
            System.out.println("Число " + x + " является простым.");
        } else {
            System.out.println("Число " + x + " не является простым.");
        }
    }
}

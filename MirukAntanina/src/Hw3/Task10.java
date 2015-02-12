package Hw3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task10 {
    public static void main(String[] args) {
        int number = 7;
        int simple = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                simple++;
            }
        }
        if (simple == 2) {
            System.out.println("Число " + number + " является простым.");
        } else {
            System.out.println("Число " + number + " не является простым.");
        }
    }
}

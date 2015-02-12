package Hw4;

/**
 Определить, какую наибольшую степень числа 100 можно вычислить, пользуясь типом int
 */
public class Task_dop3 {
    public static void main(String[] args) {
        final int NUMBER = 100;
        int step = 0;
        int rezult = 0;

        while (rezult < Integer.MAX_VALUE) {
            rezult = (int)Math.pow(NUMBER, step);
            step++;
        }

        System.out.println(step);

    }
}

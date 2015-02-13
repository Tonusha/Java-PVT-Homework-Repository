package Hw3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int simple = 2;
        for (int i = 2; i <= Math.pow(number, 0.5); i++) {
            if (number % i == 0) {
                simple++;
                break;
            }
        }
        if ((simple == 2) || (number == 1)) {
            System.out.println("Число " + number + " является простым.");
        } else {
            System.out.println("Число " + number + " не является простым.");
        }
    }
}

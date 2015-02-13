package Hw4;

import java.util.Scanner;

/**
 * Created by miruk on 2/11/15.
 */
public class Task_dop1 {
    public static void main(String[] args) {
        System.out.print("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        float number = sc.nextFloat();
        System.out.print("Введите сколько чисел после запятой сложить: ");
        float n = sc.nextFloat();
        int sum = 0, pow = 10;
        System.out.println(number % 10);
        for (int i=0; i<=n; i++) {
            number*=pow;
            float u = (number % 100-number % 10)/10;
            System.out.println(u);
           sum += u;
        }
        System.out.println("Сумма первых трех цифр дробной части заданного положительного вещественного числа " + sum);
    }
}




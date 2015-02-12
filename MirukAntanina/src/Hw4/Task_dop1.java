package Hw4;

import java.util.Scanner;

/**
 * Created by miruk on 2/11/15.
 */
public class Task_dop1 {
    public static void main(String[] args) {
        float number;
        System.out.print("Введите дробное число: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextFloat();
        number *= 1000;
        float first = number % 10;
        float two = (number % 100 - first) / 10;
        float three = (number % 1000 - number % 100) / 100;
        int sum = (int) first + (int) two + (int) three;
        System.out.println("Сумма первых трех цифр дробной части заданного положительного вещественного числа " + sum);
    }
}




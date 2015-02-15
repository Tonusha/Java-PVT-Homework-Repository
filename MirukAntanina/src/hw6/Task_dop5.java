package hw6;
//пример

import java.util.Scanner;

import static java.lang.Math.*;

public class Task_dop5 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        sc.close();
        double a = pow((cos(pow(E, x)) + pow(E, pow(x, 2)) + sqrt(1 / x)), 1 / 4);
        double b = pow(cos(PI * pow(x, 3)) + log10(pow(1 + x, 2)), sin(x));
        double y = a / b;
        System.out.println("y = " + y);
    }
}

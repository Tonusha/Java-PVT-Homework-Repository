package homeWork2;

import java.util.Scanner;

/**
 * Created by miruk on 2/11/15.
 */
public class Task3 {
    public static void main(String[] arg) {
        int num = 157;
        if (num % 10 == 7) {
            System.out.println("Последняя цифра числа " + num + " - 7.");
        } else {
            System.out.println("Последняя цифра числа " + num + " не являетя 7.");
        }
    }

    public static class Task2 {
        public static void main(String[] arg) {
            System.out.print("Введите число: ");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            sc.close();
            int sec = s % 60;
            int m = (s - sec) / 60;
            int min = m % 60;
            int h = (m - min) / 60;
            int hour = h % 24;
            int d = (h - hour) / 24;
            int day = d % 7;
            int w = (d - day) / 7;
            System.out.println(w + " weeks " + day + " days " + hour + " hours " + min + " minutes " + sec + " seconds");
        }
    }
}

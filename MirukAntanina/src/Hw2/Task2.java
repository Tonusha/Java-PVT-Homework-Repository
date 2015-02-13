package Hw2;
import java.util.Scanner;
/**
 * Created by miruk on 2/11/15.
 */
public class Task2 {
    public static void main(String[] arg) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
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


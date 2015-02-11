package Hw3;
import java.util.Scanner;
/**
 * Created by miruk on 2/11/15.
 */
public class Task15 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        byte ind = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextByte()) {
            ind = sc.nextByte();
            if (ind % 2 == 0) {
                System.out.print("Это четное число! Выход...");
                return;
            }
        }
        int array[][] = new int[ind][ind];
        System.out.println("Массив \"Бабочка\": ");
        int size = array.length - 1;                //чтобы не было выхода за пределы массива -1
        String str;                                 //чтобы был приятным вывод
        for (int i = 0; i <= size / 2; i++) {         //проходим только полмассива, т.к. сверху и снизу одинаково
            for (int j = i; j <= size - i; j++) {     //уменьшаем с каждой стороны на номер строки
                array[i][j] = array[size - i][j] = 1; //заполняем сразу с двух сторон
            }
        }
        for (int i = 0; i <= size; i++) {           //выводим
            for (int j = 0; j <= size; j++) {
                if (array[i][j] < 10) str = "  ";
                else str = " ";
                System.out.print(array[i][j] + str);
            }
            System.out.println();
        }
    }
}

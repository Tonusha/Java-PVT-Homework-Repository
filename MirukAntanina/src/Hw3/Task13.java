package Hw3;

import java.util.Scanner;

/**
 * Created by miruk on 2/11/15.
 */
public class Task13 {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        byte ind = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextByte()) {
            ind = sc.nextByte();
        }
        int array[][] = new int[ind][ind];
        System.out.println("Массив: ");
        int size = array.length - 1;
        int k = 0;
        String str;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                array[i][j] = k++;
                if (k < 10) str = "  ";
                else str = " ";
                System.out.print(array[i][j] + str);
            }
            System.out.println();
        }

        for (int i = 0; i <= size / 2; i++) {
            for (k = i; k <= size - 1 - i; k++) {
                int temp = array[i][k];//
                array[i][k] = array[size - k][i];//последний элемент столбца
                array[size - k][i] = array[size - i][size - k];
                array[size - i][size - k] = array[k][size - i];
                array[k][size - i] = temp;
            }
        }

        System.out.println("Массив, повернутый по часовой стрелке: ");
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if (array[i][j] < 10) str = "  ";
                else str = " ";
                System.out.print(array[i][j] + str);
            }
            System.out.println();
        }
    }
}


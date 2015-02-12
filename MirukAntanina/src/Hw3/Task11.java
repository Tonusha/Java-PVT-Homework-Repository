package Hw3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task11 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        int sum = 0;
        int numBreak = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
                sum += array[i];
                numBreak += 1;
            }
            if (numBreak == 2) {
                break;
            }
        }
        System.out.println("Сумма первых n чисел, которые делятся на 3 равна: " + sum);

    }
}

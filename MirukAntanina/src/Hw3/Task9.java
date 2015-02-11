package Hw3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task9 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 30, 4, 5, 6, 7, 8, 9};
        int maxelem = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (maxelem < array1[i]) {
                maxelem = array1[i];
            }
        }
        System.out.println("Максимальный элемент: " + maxelem);

    }
}

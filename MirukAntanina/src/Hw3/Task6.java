package Hw3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task6 {
    public static void main(String[] args) {
        int array[] = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i]);
        }
        System.out.println();
        int temp = 0;
        int sizeArray = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[sizeArray - i];
            array[sizeArray - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}

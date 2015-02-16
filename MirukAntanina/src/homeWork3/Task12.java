package homeWork3;

/**
 * Created by miruk on 2/11/15.
 */
public class Task12 {
    public static void main(String[] args) {
        int array[] = new int[20];
        int maxIndex = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + ", ");
        }
        int maxElem = array[0];
        System.out.println("  ");
        for (int i = 1; i < array.length; i++) {
            if (maxElem < array[i]) {
                maxElem = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Максимальный индекс элемента: " + maxIndex);

    }
}

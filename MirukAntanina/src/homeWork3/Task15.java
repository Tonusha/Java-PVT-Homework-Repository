package homeWork3;

public class Task15 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        System.out.println("Массив \"Бабочка\": ");
        int size = array.length - 1;
        String str;
        for (int i = 0; i <= size / 2; i++) {
            for (int j = i; j <= size - i; j++) {
                array[i][j] = array[size - i][j] = 1;
            }
        }
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
package Hw3;

public class Task13 {
    public static void main(String[] args) {
        int array[][] = new int[5][5];
        System.out.println("Массив: ");
        int size = array.length - 1;
        int k = 0;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                array[i][j] = (int) (Math.random() *10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= size / 2; i++) {
            for (int j = i; j <= size-i-1; j++) {
                int temp = array[i][j];
                array[i][j] = array[size - k][i];
                array[size - j][i] = array[size - i][size - j];
                array[size - i][size - j] = array[j][size - i];
                array[j][size - i] = temp;
            }
        }

        System.out.println("Массив, повернутый по часовой стрелке: ");
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}


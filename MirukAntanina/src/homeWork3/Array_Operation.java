package homeWork3;

public class Array_Operation {
    public static void ArrayPrint(int[][] array) {
        String str;
        for (int i = 0; i <= array.length - 1; i++) {
            for (int j = 0; j <= array.length - 1; j++) {
                if (array[i][j] < 10) str = "  ";
                else str = " ";
                System.out.print(array[i][j] + str);
            }
            System.out.println();
        }
    }
}

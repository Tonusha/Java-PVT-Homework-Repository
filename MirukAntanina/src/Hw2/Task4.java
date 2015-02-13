package Hw2;

public class Task4 {
    public static void main(String[] arg) {
        int a = 2, b = 4, r = 6;
        float c = a * a + b * b;
        double d = Math.pow(c, 0.5) / 2;
        if (r >= d) {
            System.out.println("Прямоугольное отверстие с размерами " + a + "x" + b + " можно накрыть круглой картонкой радиусом " + r);
        } else {
            System.out.println("Прямоугольное отверстие с размерами " + a + "x" + b + " нельзя накрыть круглой картонкой радиусом " + r);
        }
    }
}

package Hw2;

/**
 * Created by miruk on 2/11/15.
 */
public class Task4 {
    public static void main(String[] arg) {
        int a = 2;
        int b = 4;
        int r = 6;
        float c = a*a+b*b;
        double d = Math.pow(c, 0.5) / 2;
        if (r >= d) {
            System.out.println("Прямоугольное отверстие с размерами "+ a + "x" + b + " можно накрыть круглой картонкой радиусом " + r);
        } else {
            System.out.println("Прямоугольное отверстие с размерами "+ a + "x" + b + " нельзя накрыть круглой картонкой радиусом " + r);
        }
    }
}

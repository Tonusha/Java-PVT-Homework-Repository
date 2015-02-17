package homeWork7;

public class Task19 {
    public static void main(String[] args) {
        String str1 = "Без труда не выудишь и рыбку из пруда. ", str2 = "Работа не волк - в лес не убежит";
        long startTime = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            str1 += str1;
        }
        long endTime = System.nanoTime();
        long allTime = endTime-startTime;
        System.out.println("Время на выполнение конкатенации StringBuffer " + allTime);
        startTime = System.nanoTime();
        StringBuilder strBuilder = new StringBuilder (str2);
        for (int i = 0; i < 100; i++) {
            strBuilder.append(str2);
        }
        endTime = System.nanoTime();
        allTime = endTime-startTime;
        System.out.println("Время на выполнение конкатенации StringBuilder " + allTime);
    }
}

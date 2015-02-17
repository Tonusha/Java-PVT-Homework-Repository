package homeWork7;

import java.util.Arrays;

public class Task_dop8 {
    public static void main(String[] args) {

        String str = "Наносекунда (нс) — единица 8измерения времени, 7дольная по отношению child к секунде — одной из семи основных 9единиц Международной системы child единиц1 (СИ) и системы СГС.";
        String find = new String("child");
        String replase = new String("children");
        System.out.println(str);
        str = str.replaceAll(find, replase);
        System.out.println(str);
        System.out.println(str.replaceAll("[0-9]", ""));
    }
}

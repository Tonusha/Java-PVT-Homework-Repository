package homeWork7;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_dop7 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "Наносекунда (нс) — единица 8измерения времени, дольная по отношению к секунде — одной из семи основных единиц Международной системы единиц (СИ) и системы СГС. По определению, секунда представляет собой интервал времени, равный 9 192 631 770 периодам излучения электронов, переходящих между двумя энергетическими уровнями атома цезия-133. \n" +
                "Пример: за одну наносекунду свет в вакууме 9 проходит приблизительно тридцать сантиметров.";
        System.out.println(str);
        System.out.println();
        System.out.println("Количество гласных букв = " + Arrays.toString(str.split("[аяоеуюыиёэ]")).length());
        System.out.println("Количество согласных букв = "+Arrays.toString(str.split("[бвгджзклмнпрстфхчцьъшщ]")).length());
        Pattern ptrn = Pattern.compile("[^.]+");
        Matcher matcher = ptrn.matcher(str);
        while(matcher.find()){
            System.out.print('"'+matcher.group()+'"');
            System.out.println(" " + matcher.group().length() + " знаков");
        }
        ptrn = Pattern.compile("\\s");
        matcher = ptrn.matcher(str);
        int ctr = 0;
        while (matcher.find()){
            ctr++;
        }
        System.out.println("Количество пробелов = "+ctr);
        ptrn = Pattern.compile("\\n");
        matcher = ptrn.matcher(str);
        ctr = 0;
        while (matcher.find()){
            ctr++;
        }
        System.out.println("Количество абзатцев = "+ctr);
        System.out.println();
    }
}

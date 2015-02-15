package hw6;

/**
 * Created by Tonya on 15.02.2015.
 */
public class Task17_2 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "  Суть               проекта “Центр славянских языков и культур”          ";
        System.out.println(str);
        System.out.println();
        int word_cntr = 0;//счетчик слов
        int index = 0;
        while(index != -1){//пока еще что-то находится
            index = str.indexOf(' ',index+1);//ищем пробел
            if (str.indexOf(' ',index+1)-1!=index&&index != -1)
                word_cntr++;//чтобы исключить поля пробелов
        }
        System.out.println("В этой строке "+ word_cntr+" слов");
    }
}

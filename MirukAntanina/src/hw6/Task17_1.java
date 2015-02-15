package hw6;

/**
 * Created by Tonya on 15.02.2015.
 */
public class Task17_1 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "  Суть               проекта “Центр славянских языков и культур”          ";
        System.out.println(str);
        System.out.println();
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                for (;i<str.length();i++){
                    if (str.charAt(i)!=' '){
                        n++;
                        break;
                    }
                }
            }
            else if (i==0){//обрабатываем начало строки
                n++;
            }

        }
        System.out.println("В этой строке "+ n+" слов");
    }
}

package hw6;

/**
 * Имеестся строка, найти все ли скобки закрыты и сколько не закрыто
 */
public class Task_dop6 {
    public static void main(String[] args) {
        System.out.println("Исследуемая строка:");
        String str = "с лексикографически первой последовательности (((())))";
        System.out.println(str);
        System.out.println();
        int dot = 0, comma = 0, exclamation = 0, question = 0, colon = 0, dash = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '.') {
                dot++;
            } else if (ch == ',') {
                comma++;
            } else if (ch == '-') {
                dash++;
            } else if (ch == '!') {
                exclamation++;
            } else if (ch == '?') {
                question++;
            } else if (ch == ':') {
                colon++;
            }
        }
        System.out.println("В это строке: '.' - " + dot + ", ',' - "
                + comma + ", '!' - " + exclamation + ", '?' - " + question + ", ':' - " + colon + ", ' - ' - " + dash);
    }
}

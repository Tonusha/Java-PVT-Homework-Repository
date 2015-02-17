package homeWork7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Tonya on 17.02.2015.
 */
public class Task21 {
    public static void main(String[] args) {
        String str = "<p > </p> <p dsf;ldkfgjajhadlfgk kfj;sdf > </p> <p dfj;ksajfd;lkjsd> <b></b></p>";

        String find = new String("<p[^>]*>");
        String replase = new String("<p>");
        System.out.println(str);

        System.out.println(str.replaceAll(find,replase));
    }
}

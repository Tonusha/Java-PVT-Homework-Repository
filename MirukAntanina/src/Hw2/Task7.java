package Hw2;

/**
 * Created by miruk on 2/11/15.
 */
public class Task7 {
    public static void main(String[] arg) {
        int ttt = 6544;
        int one = ttt%10;
        int two = (ttt%100)/10;
        int thre = (ttt%1000)/100;
        int four = (ttt%10000)/1000;
        if ((one!=two)&&(one!=thre)&&(one!=four)&&(two!=thre)&&(two!=four)&&(thre!=four))
        {System.out.println("Все цифры числа " + ttt + " различны.");}
        else {System.out.println("Есть повторяющиеся цифры в числе " + ttt );}
    }
}
package Hw2;

/**
 * Created by miruk on 2/11/15.
 */
public class Task5 {
    public static void main(String[] arg) {
        int w = 201;
        String  ww;
        if ((w%10==1)&&(w!=11)) {    ww = " рубль ";
        }
        else if ((
                (w%10==2)||(w%10==4)||(w%10==3))&&((w!=12)||(w!=13)||(w!=14))) {
            ww = " рубля ";
        }
        else {ww = " рублей ";}

        System.out.println(w + ww);
    }
}


package Hw2;

public class Task2 {
    public static void main(String[] arg) {
        int s = 86400 * 188 + 3600 + 60 + 9;
        int sec = s % 60; // остаток - секунд
        int m = (s - sec) / 60; //вычисяем сколько минут
        int min = m % 60; // осток - минут
        int h = (m - min) / 60; //вычисяем сколько часов
        int hour = h % 24; // остаток - часов
        int d = (h - hour) / 24; //вычисляем сколько дней
        int day = d % 7; // остаток - дней
        int w = (d - day) / 7;
        String ww, dd, hh, mm, ss;
        ww = " недел";
        if ((w % 10 == 1) && (w != 11)) {
            ww = ww + "я ";
        } else if ((
                (w % 10 == 2) || (w % 10 == 3) || (w % 10 == 4)) && ((w != 12) || (w != 13) || (w != 14))) {
            ww = ww + "и ";
        } else {
            ww = ww + "ь ";
        }

        if (d == 1) {
            dd = " день ";
        } else if ((d >= 2) && (d <= 4)) {
            dd = " дня ";
        } else {
            dd = " дней ";
        }

        if ((hour == 1) || (hour == 21)) {
            hh = " час ";
        } else if (((hour >= 2) && (hour <= 4)) || (hour == 22) || (hour == 23)) {
            hh = " часа ";
        } else {
            hh = " часов ";
        }

        if ((min % 10 == 1) && (min != 11)) {
            mm = " минута ";
        } else if ((
                (min % 10 == 2) || (min % 10 == 3) || (min % 10 == 4)) && ((min != 12) || (min != 13) || (min != 14))) {
            mm = " минуты ";
        } else {
            mm = " минут ";
        }

        if ((sec % 10 == 1) && (sec != 11)) {
            ss = " секунда ";
        } else if ((
                (sec % 10 == 2) || (sec % 10 == 3) || (sec % 10 == 4)) && ((sec != 12) || (sec != 13) || (sec != 14))) {
            ss = " секунды ";
        } else {
            ss = " секунд ";
        }

        System.out.println(w + ww + day + dd + hour + hh + min + mm + sec + ss);
    }
}

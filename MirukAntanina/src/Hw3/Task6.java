package Hw3;

public class Task6 {
    public static void main(String[] args) {
        int n = 123456;
        System.out.println(n);
        int res = 0;
        for (; n>0;){
            res *=10;
            res +=  n%10;
            n/=10;
        }
        System.out.println(res);
    }
}

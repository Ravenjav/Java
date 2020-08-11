package Nach_kurs_2;

import java.util.Scanner;

public class Zadacha_34 {
    public static int nod (int a, int b){
        int o;
        while (a != 0 && b != 0) {
            if (a > b)
                a %= b;
            else
                b %= a;
        }
        if (a == 0)
            o = b;
        else
            o = a;
        return o;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int o1, o2, o;
        o1 = nod(a, b);
        o2 = nod(c, d);
        o = nod(o1, o2);
        System.out.println(o);
    }
}

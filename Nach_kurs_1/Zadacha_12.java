package Nach_kurs_1;

import java.util.Scanner;

public class Zadacha_12 {
    public static void main(String[] args) {
        int s = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            s += i;
        System.out.println(s);
    }
}

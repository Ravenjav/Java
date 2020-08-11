package Nach_kurs_2;

import java.util.Scanner;

public class Zadacha_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int s = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] % k == 0)
                s += a[i];
        }
        System.out.println(s);
    }
}

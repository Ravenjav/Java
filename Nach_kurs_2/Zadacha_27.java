package Nach_kurs_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList <Integer> ();
        int f;
        for (int i = 0; i < n; i++){
            f = in.nextInt();
            a.add(f);
        }
        int n2 = in.nextInt();
        int a2[] = new int [n2];
        for (int i = 0; i < n2; i++)
            a2[i] = in.nextInt();
        int k = in.nextInt();
        for (int i = n2 - 1; i > -1; i--)
            a.add(k, a2[i]);
        for (int i = 0; i < a.size(); i++)
            System.out.println(a.get(i));
    }
}

package Nach_kurs_2;

import javafx.stage.Screen;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadacha_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int mi = 1000000;
        ArrayList <Integer> a = new ArrayList <Integer> ();
        for (int i = 0; i < n; i++){
            int f = in.nextInt();
            a.add(f);
            if (f < mi)
                mi = f;
        }
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) == mi){
                a.remove(i);
                i--;
                continue;
            }
            System.out.println(a.get(i));
        }
    }
}

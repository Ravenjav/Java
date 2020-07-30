package Task4_4;

import com.sun.javaws.IconUtil;

public class Main {

    public static void poisk(int x, Train t[]) {
        for (int i = 0; i < 5; i++){
            if (t[i].getnum() == x) {
                System.out.println(t[i].getpn() + " " + t[i].gettime() / 60 + ":" + t[i].gettime() % 60);
                break;
            }
        }
    }

    public static void sortnom(Train t[]) {
        for (int i = 1; i < 5; i++)
            for (int j = 0; j < 4; j++){
                Train f;
                if (t[j].getnum() > t[j+1].getnum()){
                    f = t[j];
                    t[j] = t[j+1];
                    t[j+1] = f;
                }
            }
    }

    public static void sortpn(Train t[]){
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 4; j++){
                Train f;
                if (t[j].getpn().compareTo(t[j+1].getpn())>0 || (t[j].getpn().compareTo(t[j+1].getpn()) == 0 && t[j].gettime()>t[j+1].gettime())){
                    f = t[j];
                    t[j] = t[j+1];
                    t[j+1] = f;
                }
            }
    }
    public static void main(String[] args) {
        Train t[] = new Train[5];
        for (int i = 0; i < 5; i++) {
            t[i] = new Train("Сity" + -i, 10-i, (int) (Math.random() * 1000));
            System.out.println(t[i].getpn() + " " + t[i].getnum() + " " + t[i].gettime()/60 + ":" + t[i].gettime()%60);
        }
        System.out.println();

        poisk(3, t);
        System.out.println();

        sortnom(t);
        for (int i = 0; i < 5; i++)
            System.out.println(t[i].getpn() + " " + t[i].getnum() + " " + t[i].gettime()/60 + ":" + t[i].gettime()%60);
        System.out.println();

        sortpn(t);
        for (int i = 0; i < 5; i++)
            System.out.println(t[i].getpn() + " " + t[i].getnum() + " " + t[i].gettime()/60 + ":" + t[i].gettime()%60);
    }
}

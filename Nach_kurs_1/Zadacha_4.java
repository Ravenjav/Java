package Nach_kurs_1;

public class Zadacha_4 {
    public static void main(String[] args) {
        double r = 225.743;
        //double f = ((double) (int) (r / 100) / 10) + ((double) (int) (r / 10 % 10) / 100) + ((double) (int) (r % 10) / 1000) ;
        int rw = (int) r;
        double f =  (double) rw / 1000;
        f += (r - rw) * 1000;
        System.out.println(f);
    }
}

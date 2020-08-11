package Nach_kurs_1;

public class Zadacha_2 {
    public static void main(String[] args) {
        double b = 1, a = 1, c = 1;
        double z = (b + Math.pow(b * b + 4 * c * a, (double) 1 / 2)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println(z);
    }
}

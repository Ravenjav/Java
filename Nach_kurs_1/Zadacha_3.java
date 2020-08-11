package Nach_kurs_1;

public class Zadacha_3 {
    public static void main(String[] args) {
        double x = 1, y = 1;
        double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}

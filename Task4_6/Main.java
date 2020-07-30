package Task4_6;

public class Main {
    public static void main(String[] args) {
        Time t = new Time(2, 30, 40);
        t.izmup(1, 50, 20);
        System.out.println(t.getH() + " " + t.getM() + " " + t.getS());
    }
}

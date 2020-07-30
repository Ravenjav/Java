package Task4_5;

public class Main {
    public static void main(String[] args) {
        Schet t = new Schet();
        Schet f = new Schet(5, 0, 9);
        t.up();
        System.out.println(t.getzn());
        t.up();
        f.down();
        System.out.println(t.getzn() + " " + f.getzn());
    }
}

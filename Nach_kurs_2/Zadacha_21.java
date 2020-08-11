package Nach_kurs_2;

public class Zadacha_21 {
    public static void main(String[] args) {
        int a[][] = new int[10][20];
        for (int i = 0; i < 10; i++) {
            int k = 0;
            for (int j = 0; j < 20; j++) {
                a[i][j] = (int) (Math.random() * 10);
                if (a[i][j] == 5)
                    k++;
            }
            if (k > 2)
                System.out.print(k + " ");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

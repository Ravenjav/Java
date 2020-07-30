package Task4_3;

public class main {

    public static void out(Student st){
        System.out.print(st.getfio() + "  " + st.getnog() + " ");
        int[] r = new int[5];
        r = st.getap();
        for (int j = 0; j < 5; j++)
            System.out.print(" " + r[j]);
        System.out.println();
    }

    public static void main(String[] args) {
        Student st[] = new Student[10];
        int[] r;
        for (int i = 0; i < 10; i++){
            r = new int[5];
            for (int j = 0; j < 5; j++){
                r[j] = (int) (Math.random()*10);
            }
            st[i] = new Student("Name"+i, 2, r);
        }

        for (int i=0; i<10; i++)
            out(st[i]);
        System.out.println();

        for (int i = 0; i < 10; i++){
            if (st[i].chek())
               out(st[i]);
        }
    }
}

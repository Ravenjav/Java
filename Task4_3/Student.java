    package Task4_3;

    import java.util.Scanner;

    public class Student {
        private String fio;
        private int nog;
        private int[] ap = new int[5];

        public Student (String fio, int nog, int[] ap){
            this.fio = fio;
            this.nog = nog;
            this.ap = ap;
        }

        public boolean chek(){
            for (int i = 0; i < 5; i++)
                if (ap[i] < 4)
                    return false;
            return true;
        }


        public String getfio() {
            return fio;
        }

        public void setfio(String fio){
            this.fio = fio;
        }

        public int getnog(){
            return nog;
        }

        public void setnog(int nog){
            this.nog = nog;
        }

        public int[] getap(){
            return ap;
        }

        public void setap(int[] ap){
            this.ap = ap;
        }
    }

package Task4_2;

public class Test2 {
    private int a, b;

    public Test2 (){
        a = 0;
        b = 0;
    }

    public Test2 (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void geta(int a){
        this.a = a;
    }

    public void getb(int b){
        this.b = b;
    }

    public int seta(){
        return a;
    }

    public int setb(){
        return b;
    }
}

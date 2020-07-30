package Task4_1;

import java.util.Scanner;

public class Test1 {
    private int a, b;

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

    public void seta(int a){
        this.a = a;
    }

    public void setb(int b){
        this.b = b;
    }

    public int sum(){
        return a + b;
    }

    public int max(){
        return Math.max(a,b);
    }
}

package Task4_5;

public class Schet {

    private int zn;
    private int l;
    private int r;

    public Schet(){
        zn = 0;
        l = 0;
        r = 1;
    }

    public Schet(int zn, int l, int r){
        this.zn = zn;
        this.l = l;
        this.r = r;
    }

    public int getzn(){
        return zn;
    }

    public void setzn(int zn){
        this.zn = zn;
    }

    public void up(){
        zn++;
        if (zn > r)
            zn = l;
    }

    public void down(){
        zn--;
        if (zn < l)
            zn = r;
    }
}

package Task4_6;

public class Time {
    private int h;
    private int m;
    private int s;

    public Time(){
        h = 0;
        m = 0;
        s = 0;
    }

    public Time(int h, int m, int s){
        if (h > -1 && h < 25)
            this.h = h;
        else
            this.h = 0;

        if (m > -1 && m < 61)
            this.m = m;
        else
            this.m = 0;

        if (s > -1 && s < 61)
            this.m = m;
        else
            this.m = 0;
    }

    public void izmup(int h, int m, int s){
        this.s += s;
        while (this.s > 59){
            this.m++;
            this.s -= 60;
        }

        this.m += m;
        while (this.m > 59){
            this.h++;
            this.m -= 60;
        }

        this.h += h;
        while (this.h > 23)
            this.h -= 24;
    }

    public void izmdown(int h, int m, int s){
        this.s -= s;
        while (this.s < 0){
            this.m--;
            this.s += 60;
        }

        this.m -= m;
        while (this.m < 0){
            this.h--;
            this.m += 60;
        }

        this.h -= h;
        while (this.h < 0)
            this.h += 24;
    }

    public void setH(int h) {
        if (h > -1 && h < 25)
            this.h = h;
        else
            this.h = 0;
    }

    public int getH() {
        return h;
    }

    public void setM(int m) {
        if (m > -1 && m < 61)
            this.m = m;
        else
            this.m = 0;
    }

    public int getM() {
        return m;
    }

    public void setS(int s) {
        if (s > -1 && s < 61)
            this.m = m;
        else
            this.m = 0;
    }

    public int getS() {
        return s;
    }
}

package Task4_4;

public class Train {
    private String pn;
    private int num;
    private int time;

    public Train(String pn, int num, int time){
        this.pn = pn;
        this.num = num;
        this.time = time;
    }

    public String getpn(){
        return pn;
    }

    public void setpn(String pn){
        this.pn = pn;
    }

    public int getnum(){
        return num;
    }

    public void setnum(int num){
        this.num = num;
    }

    public int gettime(){
        return time;
    }

    public void settime(int time){
        this.time = time;
    }
}

package Task4_8;

public class Customer {
    private int id;
    private String sname, name, fname, address;
    private long numofcard, numofacc;

    public Customer(){
        super();
    }

    public Customer(int id, String sname, String name, String fname, String address, long numofcard, long numofacc) {
        this.id = id;
        this.sname = sname;
        this.name = name;
        this.fname = fname;
        this.address = address;
        this.numofcard = numofcard;
        this.numofacc = numofacc;
    }

    public int getId() {
        return id;
    }

    public long getNumofcard() {
        return numofcard;
    }

    public long getNumofacc() {
        return numofacc;
    }

    public String getSname() {
        return sname;
    }

    public String getName() {
        return name;
    }

    public String getFname() {
        return fname;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumofcard(long numofcard) {
        this.numofcard = numofcard;
    }

    public void setNumofacc(long numofacc) {
        this.numofacc = numofacc;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", numofcard=" + numofcard +
                ", numofacc=" + numofacc +
                ", sname='" + sname + '\'' +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

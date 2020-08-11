public class Book {
    private String name;
    private String author;
    private int date;

    Book(){
        super();
    }

    Book(String vvod){
        int na = 0;
        for (int i = 0; i < vvod.length(); i++){
            if (vvod.charAt(i) == '.'){
                name = vvod.substring(na, i);
                na = i + 1;
            }
            if (vvod.charAt(i) == ','){
                author = vvod.substring(na, i);
                date = Integer.parseInt(vvod.substring(i+1));
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + " " + author + " " + date;
    }

    public String toFile() {
        return name + "." + author + "," + date + "\n";
    }
}

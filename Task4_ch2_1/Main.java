package Task4_ch2_1;

public class Main {
    public static void main(String[] args) {
        Text presf = new Text("Program", "This program works. Amazing!");
        String s = presf.getHeading();
        System.out.println(s);
        s = presf.getSentences();
        System.out.println(s);
        presf.add("Just unbelieveble!");
        s = presf.getSentences();
        System.out.println(s);
    }
}

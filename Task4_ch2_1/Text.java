package Task4_ch2_1;

import java.util.ArrayList;

public class Text {
    private String heading;
    private ArrayList<Sentence> sentences;

    Text (String heading, String s){
        sentences = new ArrayList<Sentence>();
        this.heading = heading;
        int begin = 0;
        String str_sent = "";
        if (s.charAt(s.length()-1) != ' ')
            s += ' ';
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'){
                str_sent = s.substring(begin, i+2);
                begin = i+2;
                Sentence sentence = new Sentence(str_sent);
                sentences.add(sentence);
            }
    }

    public void add(String s){
        String str_sent = "";
        int begin = 0;
        if (s.charAt(s.length()-1) != ' ')
            s += ' ';
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '.' || s.charAt(i) == '?' || s.charAt(i) == '!'){
                str_sent = s.substring(begin, i+2);
                begin = i+2;
                Sentence sentence = new Sentence(str_sent);
                sentences.add(sentence);
            }
        }
    }

    public String getHeading() {
        return heading;
    }

    public String getSentences() {
        String out = "";
        int razm = sentences.size();
        for (int i = 0; i < razm; i++){
            out += sentences.get(i).getSentence();
            if (i != razm - 1)
                out += ' ';
        }
        return out;
    }
}

package Task4_ch2_1;

import java.util.ArrayList;

public class Sentence {
    private ArrayList<Word> words;
    private ArrayList<Symbol> symbols;

    Sentence (String sentence){
        words = new ArrayList<Word>();
        symbols = new ArrayList<Symbol>();

        String str_word;
        int numb = 0; // координата начала слова
        for (int i = 0; i <sentence.length(); i++){
            if (sentence.charAt((i)) == ' ') {
                char znak = sentence.charAt(i - 1);
                if (znak == '.' || znak == ',' || znak == ';' || znak == ':' || znak == '!' || znak == '?' || znak == '"') {
                    Symbol symbol = new Symbol(words.size(), znak);
                    symbols.add(symbol);
                    str_word = sentence.substring(numb, i - 1);
                }
                else
                    str_word = sentence.substring(numb, i);
                Word word = new Word(str_word);
                words.add(word);
                numb = i+1;
            }
        }
    }

    public String getSentence() {
        int j = 0;
        char symb = symbols.get(j).getSymbol();
        int numb = symbols.get(j).getNumb_of_word();
        int razm = words.size();
        String out = "";
        for (int i = 0; i < razm; i++){
            out += words.get(i).getWord();
            if (numb == i){
                out += symb;
                if (i == razm - 1)
                    return out;
                j++;
                symb = symbols.get(j).getSymbol();
                numb = symbols.get(j).getNumb_of_word();
            }
            out += ' ';
        }
        return out; // по сути не нужно, но программа требует наличия данной строки
    }
}

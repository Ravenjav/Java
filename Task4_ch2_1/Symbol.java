package Task4_ch2_1;

public class Symbol {
    private int numb_of_word;//хранит номер слова после которого нужно вставить знак препинания
    private char symbol; //хранит сам знак

    Symbol(int numb_of_word, char symbol){
        this.numb_of_word = numb_of_word;
        this.symbol = symbol;
    }

    public int getNumb_of_word() {
        return numb_of_word;
    }

    public char getSymbol() {
        return symbol;
    }
}

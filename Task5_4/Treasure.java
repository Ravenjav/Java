package Task5_4;

public class Treasure{
    private String name;
    private int value;

    Treasure(String info){
        int na = 0;
        for (int i = 0; i < info.length(); i++) {
            if (info.charAt(i) == '('){
                na = i;
                name = info.substring(0, i);
                name = name.trim();
            }
            if (info.charAt(i) == ')' && na != 0){
                if (!Main.isnumber(info.substring(na + 1, i))){
                    name = "";
                    value = -1;
                }
                else
                    value = Integer.parseInt(info.substring(na + 1, i));
                break;
            }
            if (i == info.length() - 1){
                name = "";
                value = -1;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name + " (" + value + ")";
    }
}

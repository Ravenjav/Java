package Task5_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static String chek(){
        Scanner in = new Scanner(System.in);
        String s;
        while (true){
            s = in.nextLine();
            s = s.trim();
            if (s.length() == 0) {
                System.out.println("Неверный формат ввода, попробуйте ещё раз");
                continue;
            }
            if (!isnumber(s)) {
                System.out.println("Неверный формат ввода, попробуйте ещё раз");
                continue;
            }
            break;
        }
        return s;
    }

    public static String chek_3(){
        Scanner in = new Scanner(System.in);
        String s;
        while (true){
            s = in.nextLine();
            s = s.trim();
            if (s.length() == 0) {
                System.out.println("Неверный формат ввода, попробуйте ещё раз");
                continue;
            }
            if (!isnumber_2(s)) {
                System.out.println("Неверный формат ввода, попробуйте ещё раз");
                continue;
            }
            break;
        }
        return s;
    }

    public static int chek_2(int max){
        int ch;
        while (true){
            ch = Integer.parseInt(chek());
            if (max < ch || ch < 1)
                System.out.println("Неверный формат ввода, попробуйте ещё раз");
            else
                return ch;
        }
    }

    public static boolean isnumber(String s){
        return s.matches("\\d*");
    }

    public static boolean isnumber_2(String s){
        return s.matches("[\\d\\s]*");
    }

    public static void readfile(ArrayList<Treasure> treasures) throws Exception {
        FileReader file = new FileReader("C:\\Users\\User\\IdeaProjects\\OOP\\src\\Task5_4\\List.txt");
        BufferedReader read = new BufferedReader(file);
        int i = 0;
        String s = read.readLine();
        while (s != null) {
            Treasure treasure = new Treasure(s);
            treasures.add(treasure);
            s = read.readLine();
        }
        file.close();
    }

    public static void writefile(ArrayList<Treasure> treasures) throws Exception {
        FileWriter file = new FileWriter("C:\\Users\\User\\IdeaProjects\\OOP\\src\\Task5_4\\List.txt", false);
        for (int i = 0; i < treasures.size(); i++) {
            file.write(treasures.get(i).toString());
            file.write('\n');
        }
        file.close();
    }

    public static void out(ArrayList<Treasure> treasures, int i){
        System.out.println(treasures.get(i).getName() + " (" + treasures.get(i).getValue() + ")");
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Treasure> treasures = new ArrayList<Treasure>();
        readfile(treasures);
        String kom = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Здравствуй, пользователь!");
        while (!kom.equals("end")) {
            System.out.println("Выберите команду:");
            System.out.println("add - Добавить сокровища");
            System.out.println("info - Список сокровищ");
            System.out.println("choose_one - Выбор самого дорогово сокровища");
            System.out.println("choose_few - Выбор сокровищ на данную сумму");
            System.out.println("end - выход");

            kom = in.nextLine();
            String s;

            switch (kom) {

                case "add": {
                    System.out.println("Введите количество сокровищ, которое хотите добавить, а затем через пробел их параметры: название и цена(цена должны быть в круглых скобках)");
                    s = chek();
                    int kol = Integer.parseInt(s);
                    String info;
                    for (int i = 0; i < kol; i++) {
                        info = in.nextLine();
                        info = info.trim();
                        if (info.length() == 0) {
                            System.out.println("Неверный формат ввода, попробуйте ещё раз");
                            i--;
                            continue;
                        }
                        Treasure treasure = new Treasure(info);
                        if (treasure.getValue() < 0) {
                            System.out.println("Неверный формат ввода, попробуйте ещё раз");
                            i--;
                            continue;
                        }
                        int poz = 0;
                        for (int j = 0; j < treasures.size(); j++) {
                            if (treasure.getValue() < treasures.get(j).getValue()) {
                                poz = j;
                                break;
                            } else
                                poz++;
                        }
                        treasures.add(poz, treasure);
                    }
                    System.out.println("Операция завершена успешно!");
                    break;
                }

                case "info": {
                    if (treasures.size() == 0)
                        System.out.println("Сокровищ в пещере нет");
                    for (int i = 0; i < treasures.size(); i++)
                        out(treasures, i);
                    System.out.println();
                    break;
                }

                case "choose_one": {
                    if (treasures.size() == 0) {
                        System.out.println("Сокровищ в пещере нет");
                        break;
                    }

                    int size = 0;
                    for (int i = treasures.size() - 1; i > -1; i--)
                        if (treasures.get(i).getValue() == treasures.get(treasures.size() - 1).getValue()) {
                            size++;
                            System.out.print(size + " ");
                            out(treasures, i);
                        } else break;
                    System.out.println("3 Оменить выбор");
                    size++;
                    if (size > 2) {
                        System.out.println("Введите номер сокровища, которое вы хотите забрать");
                        int num = chek_2(size);
                        if (num != size) {
                            System.out.println("Операция завершена успешно!");
                            treasures.remove(treasures.size() - num);
                        }
                    } else {
                        System.out.println("Хотите забрать это сокровище? Yes / No");
                        while (true) {
                            String answer = in.nextLine();
                            if (answer.equals("Yes")) {
                                System.out.println("Операция завершена успешно!");
                                treasures.remove(treasures.size() - 1);
                                break;
                            }
                            if (answer.equals("No"))
                                break;
                            System.out.println("Неизвестная команда, попробуйте ещё раз :)");
                        }
                    }
                    break;
                }

                case "choose_few": {
                    if (treasures.size() == 0) {
                        System.out.println("Сокровищ в пещере нет");
                        break;
                    }
                    System.out.println("Введите сумму");
                    s = chek();
                    int value = Integer.parseInt(s);
                    int j = 0;
                    while (value > treasures.get(j).getValue()) {
                        System.out.print(j + 1 + " ");
                        out(treasures, j);
                        j++;
                    }
                    System.out.println("Введите, через пробел, номера, нужных вам предметов");
                    while (true) {
                        int f = 0;
                        String num = chek_3();
                        ArrayList<Integer> mas = new ArrayList<Integer>();
                        int sum = 0;
                        int na = 0;
                        for (int i = 0; i < num.length(); i++)
                            if (num.charAt(i) == ' ' || i == num.length() - 1) {
                                if (num.charAt(i) == ' ')
                                    mas.add(Integer.parseInt(num.substring(na, i)));
                                else
                                    mas.add(Integer.parseInt(num.substring(na, i + 1)));
                                if (mas.get(mas.size() - 1) > j || mas.get(mas.size() - 1) < 1) {
                                    f = 1;
                                    break;
                                }
                                sum += treasures.get(mas.get(mas.size() - 1)).getValue();
                                na = i + 1;
                            }
                        if (f == 1) {
                            System.out.println("Неверный формат ввода, попробуйте ещё раз");
                            continue;
                        }
                        if (sum > value)
                            System.out.println("Эти предметы слишком дорогие для вас, попробуйте ещё раз");
                        else {
                            System.out.println("Операция выполнена успешно!");
                            System.out.println();
                            for (int i = 0; i < mas.size(); i++)
                                treasures.remove(mas.get(i) - 1);
                            break;
                        }
                    }
                    break;
                }

                case "end": {
                    System.out.println("Программа успешно завершила работ");
                    writefile(treasures);
                    break;
                }

                default: {
                    System.out.println("Неизвестная команда");
                }
            }
        }
    }
}

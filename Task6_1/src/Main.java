import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void user_interface() throws Exception{
        System.out.println("Добро пожаловать пользователь");
        ArrayList<Book> books = new ArrayList<>();
        int maxpages = readFile(books);
        if (books.size() == 0){
            System.out.println("Книг в каталоге нет");
            return;
        }
        if (maxpages == 0)
            maxpages++;
        String kom = "";
        while(!kom.equals("end")){
            System.out.println("Список команд:");
            System.out.println("watch - Просмотр книг");
            System.out.println("find - Поиск книги");
            System.out.println("end - Завершить программу");
            Scanner in = new Scanner(System.in);
            kom = in.nextLine().trim();
            switch (kom) {
                case "watch": {
                    int page = 1;
                    out_Page(page, books);
                    while (true) {
                        if (page != maxpages)
                            System.out.println("next - Следующая страница");
                        if (page != 1)
                            System.out.println("back - Предыдущая страница");
                        System.out.println("end - Закончить просмотр");
                        String kom2 = in.nextLine().trim();
                        if (kom2.equals("next")) {
                            page++;
                            out_Page(page, books);
                            continue;
                        }
                        if (kom2.equals("back")) {
                            page--;
                            out_Page(page, books);
                            continue;
                        }
                        if (kom2.equals("end"))
                            break;
                        System.out.println("Неизвестная команда, попробуйте ещё раз");
                    }
                    break;
                }

                case "find": {
                    while (true) {
                        System.out.println("1 - Поиск по названию");
                        System.out.println("2 - Поиск по автору");
                        System.out.println("3 - Поиск по дате выпуска");
                        String kom3 = in.nextLine().trim();
                        if (kom3.equals("1")) {
                            System.out.println("Введите название книги");
                            find1(books, in.nextLine().trim());
                            break;
                        }
                        if (kom3.equals("2")) {
                            System.out.println("Введите автора книги");
                            find2(books, in.nextLine().trim());
                            break;
                        }
                        if (kom3.equals("3")) {
                            System.out.println("Введите дату выпуска книги");
                            String num;
                            while (true) {
                                num = in.nextLine().trim();
                                if (isNumber(num))
                                    break;
                                else
                                    System.out.println("Неверный формат ввода, попробуйте ещё раз");
                            }
                            find3(books, Integer.parseInt(num));
                            break;
                        }
                        System.out.println("Неизвестная команда, попробуйте ешё раз");
                    }
                    break;
                }

                case "end": {
                    System.out.println("Программа успешно завершила работу");
                    break;
                }

                default:
                    System.out.println("Неизвестная команда, попробуйте ешё раз");
            }
        }
    }

    public static void out_Page(int page, ArrayList<Book> books){
        int last = Math.min(page * 10, books.size());
        for (int i = (page - 1) * 10; i < last; i++)
            System.out.println((i + 1) + " " + books.get(i).toString());
        System.out.println("-----------------------------------------");
    }

    public static void find1(ArrayList<Book> books, String name){
        int f = 0;
        for (int i = 0; i < books.size(); i++)
            if (name.equals(books.get(i).getName())) {
                System.out.println(books.get(i).toString());
                f = 1;
            }
        if (f == 0)
            System.out.println("Совпадений не обнаружено");
        else
            System.out.println("-----------------------------------------");
    }

    public static void find2(ArrayList<Book> books, String author){
        int f = 0;
        for (int i = 0; i < books.size(); i++)
            if (author.equals(books.get(i).getAuthor())) {
                System.out.println(books.get(i).toString());
                f = 1;
            }
        if (f == 0)
            System.out.println("Совпадений не обнаружено");
        else
            System.out.println("-----------------------------------------");
    }

    public static void find3(ArrayList<Book> books, int date){
        int f = 0;
        for (int i = 0; i < books.size(); i++)
            if (date == books.get(i).getDate()) {
                System.out.println(books.get(i).toString());
                f = 1;
            }
        if (f == 0)
            System.out.println("Совпадений не обнаружено");
        else
            System.out.println("-----------------------------------------");
    }

    public static void admin_Interface() throws Exception{
        System.out.println("Приветствую администратор");
        ArrayList<Book> books = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int maxpages = readFile(books);
        if (maxpages == 0)
            maxpages++;
        String kom = "";
        while(!kom.equals("end")){
            System.out.println("Cписок команд:");
            System.out.println("add - добавить описание книги");
            System.out.println("delete - удалить книгу");
            System.out.println("end - Закончить работу");
            kom = in.nextLine().trim();
            switch (kom){
                case "add":{
                    while (true) {
                        System.out.print("name: ");
                        String name = in.nextLine().trim();
                        System.out.print("author: ");
                        String author = in.nextLine().trim();
                        System.out.print("date: ");
                        String str_date = in.nextLine().trim();
                        int date;
                        if (isNumber(str_date)) {
                            date = Integer.parseInt(str_date);
                            Book book = new Book();
                            book.setName(name);
                            book.setAuthor(author);
                            book.setDate(date);
                            books.add(book);
                            System.out.println("Действие выполнено успешно");
                            break;
                        }
                        else
                            System.out.println("Неверный формат входных данных");
                    }
                    break;
                }

                case "delete":{
                    int page = 1;
                    out_Page(page, books);
                    while(true){
                        if (page != maxpages)
                            System.out.println("next - Следующая страница");
                        if (page != 1)
                            System.out.println("back - Предыдущая страница");
                        System.out.println("end - Закончить просмотр");
                        String kom2 = in.nextLine().trim();
                        if (kom2.equals("next")){
                            page++;
                            out_Page(page, books);
                            continue;
                        }
                        if (kom2.equals("back")){
                            page--;
                            out_Page(page, books);
                            continue;
                        }
                        if (kom2.equals("end"))
                            break;
                        if (isNumber(kom2)){
                            int num = Integer.parseInt(kom2);
                            while (true) {
                                System.out.println("Хотите удалить описание книги под номером - " + num + " ? Yes/No");
                                String kom3 = in.nextLine().trim();
                                if (kom3.equals("Yes")) {
                                    books.remove(num - 1);
                                    System.out.println("Действие выполнено успешно!");
                                    break;
                                }
                                if (kom3.equals("No"))
                                    break;
                                System.out.println("Неизвестная команда, попробуйте ещё раз");
                            }
                            break;
                        }
                        System.out.println("Неизвестная команда, попробуйте ещё раз");
                    }
                    break;
                }

                case "end":{
                    System.out.println("Программа завершена успешно!");
                    break;
                }

                default:
                    System.out.println("Неизвестная команда, попробуйте ещё раз");
            }
        }
        writeFile(books);
    }

    public static boolean isNumber(String s){
        return s.matches("\\d*");
    }

    public static int  find_User(String login, String password) throws Exception {
        FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\Users.txt");
        BufferedReader read = new BufferedReader(file);
        String s = read.readLine();
        while (s != null) {
            int f = 0;
            int na = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    if (s.substring(0, i).equals(login))
                        na = i + 1;
                    else
                        break;
                }
                if (s.charAt(i) == '('){
                    if (s.substring(na, i).equals(password)) {
                        na = i + 1;
                        f = 1;
                    }
                    break;
                }
            }
            if (f == 1) {
                file.close();
                return Integer.parseInt(s.substring(na, na + 1));
            }
            s = read.readLine();
        }
        file.close();
        return 2;
    }

    public static int readFile(ArrayList<Book> books) throws Exception {
        FileReader file = new FileReader(System.getProperty("user.dir") + "\\src\\Books.txt");
        BufferedReader read = new BufferedReader(file);
        int num = 0;
        String s = read.readLine();
        while (s != null) {
            num++;
            Book book = new Book(s);
            books.add(book);
            s = read.readLine();
        }
        file.close();
        return num / 10;
    }

    public static void writeFile(ArrayList<Book> books) throws Exception {
        FileWriter file = new FileWriter(System.getProperty("user.dir") + "\\src\\Books.txt", false);
        for (int i = 0; i < books.size(); i++)
            file.write(books.get(i).toFile());
        file.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("Введите логин и пароль");
            System.out.print("Login: ");
            String login = in.nextLine().trim();
            System.out.print("Password: ");
            String password = in.nextLine().trim();
            int rez = find_User(login, password);
            if (rez == 0){
                admin_Interface();
                break;
            }
            if (rez == 1){
                user_interface();
                break;
            }
            if (rez == 2){
                System.out.println("Неверный логин или пароль. Хотите попробовать ещё раз? Yes/No");
                while (true){
                    String s = in.nextLine();
                    if (s.equals("Yes"))
                        break;
                    if (s.equals("No")) {
                        System.out.println("Программа успешно завершена");
                        return;
                    }
                    System.out.println("Неизвестная команда");
                }
            }
        }
    }
}

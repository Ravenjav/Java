package Task4_8;

public class Main {
    public static void main(String[] args) {
        Customer cl1 = new Customer(12, "Sovelev", "Ivan", "Vladimirovich", "Minkaya4", 213, 14 );
        Customer cl2 = new Customer(23, "Vershinskiy", "Andrey", "Artemovich", "Pushkina46", 505, 123);
        Customer cl3 = new Customer(7, "Orlov", "Mihail", "Dmitrievich", "Stroiteley25", 101, 210);
        MasCustomer mas = new MasCustomer(cl1, cl2, cl3);
        mas.a();
        System.out.println();
        mas.b(100, 200);
    }
}

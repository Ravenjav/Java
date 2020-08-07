package Task4_8;

import com.sun.javaws.IconUtil;

public class MasCustomer {
    private Customer[] customers = new Customer[3];
    MasCustomer (Customer ... mas){
        for (int i = 0; i < mas.length; i++){
            //customers[i] = new Customer();
            customers[i] = mas[i];
        }

    }

    private void swap(int i, int j) {
        Customer pul;
        pul = customers[i];
        customers[i] = customers[j];
        customers[j] = pul;
    }

    public void a() {
        for (int i = 0; i < customers.length; i++)
            for (int j = 1; j < customers.length; j++) {
                String s1 = customers[j].getSname();
                String s2 = customers[j-1].getSname();
                if (s1.compareTo(s2) < 0)
                    swap(j, j-1);
                else
                    if (s1.compareTo(s2) == 0) {
                        s1 = customers[j].getName();
                        s2 = customers[j-1].getName();
                        if (s1.compareTo(s2) < 0)
                            swap(j, j-1);
                        else
                            if (s1.compareTo(s2) == 0) {
                                s1 = customers[j].getFname();
                                s2 = customers[j-1].getFname();
                                if (s1.compareTo(s2) < 0)
                                    swap(j, j-1);
                            }
                    }
            }
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].getSname() + " " + customers[i].getName() + " " + customers[i].getFname());

    }

    public void b(long l, long r) {
        for (int i = 0; i < customers.length; i++) {
            long num = customers[i].getNumofcard();
            if (l < num && num < r)
                System.out.println(customers[i].getSname() + " " + customers[i].getName() + " " + customers[i].getFname());
        }
    }
}

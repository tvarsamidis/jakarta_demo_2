package gr.codehub.jak20242.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmodifiableListDemo {


    public static void main(String[] args) {
        List<String> customers = List.of("Thomas", "Maria");

        Date endOfPolicy; // modifiable
        LocalDate startOfPolicy; // unmodifiable
        printCustomers(customers);
        // other jobs
        printCustomers(customers);
        customers.add("Kostas");
    }

    private static void printCustomers(List<String> customers) {
        System.out.println("-----------------");
        for(int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
}

package org.javaCore.consumer;

import org.javaCore.function.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> print = s -> System.out.println(s);

        List<Customer> list = new ArrayList<>();
        list.add(new Customer("thomas", 10, "mobile"));
        list.add(new Customer("mike", 20, "mobile"));
        list.add(new Customer("Raju", 15, "windows"));
        list.add(new Customer("krishna", 25, "apple"));

        Consumer<Customer> consumer = c -> {
            System.out.println(c.getName());
            System.out.println(c.getAge());
            System.out.println(c.getDevice());
            System.out.println(""); // Assuming there should be an empty line after printing customer details
        };

        for (Customer c : list) {
            consumer.accept(c);
        }
    }
}

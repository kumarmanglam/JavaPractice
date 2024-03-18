package org.javaCore.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList();
        list.add(new Customer(101, "John", "Iphone 14"));
        list.add(new Customer(102, "Mike", "Samsung 322"));
        list.add(new Customer(103, "peter", "Oppo"));
        list.add(new Customer(104, "Raju", "Vivo"));
        list.add(new Customer(105, "krishna", "Iphone 15"));
        list.add(new Customer(106, "Ganesh", "Sansung z2 fold"));

        List<Customer> result = list.stream()
                .filter(str -> str.getPhone().contains("Ip"))
                .filter(str -> str.getName().contains("J"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);
    }

}

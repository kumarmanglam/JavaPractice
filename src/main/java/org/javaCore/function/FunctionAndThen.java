package org.javaCore.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionAndThen {
    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length(); // length
        Function<Integer, Integer> func2 = i -> i * 2; // length *2

        Integer result = func.andThen(func2).apply("Java8functions");
//        System.out.println(result);

        List<Customer> list = new ArrayList<>();
        list.add(new Customer("thomas", 10, "mobile"));
        list.add(new Customer("mike", 20, "mobile"));
        list.add(new Customer("Raju", 15, "windows"));
        list.add(new Customer("krishna", 25, "apple"));

        Function<Customer, Customer> fc = c -> c;

        Predicate<Customer> po = o -> o.getAge() > 18;
        Function<Customer, String> fl = c -> c.getDevice();
        Predicate<Customer> pl = o -> o.getDevice().equals("apple");

        for (Customer c : list) {
            if (po.and(pl).test(c)) {
                System.out.println(c.getName()+ " --> " + fl.apply(c));
//                System.out.println(c.getName() + " --> " + fc.andThen(fl).apply(c));
            }
        }
    }
}

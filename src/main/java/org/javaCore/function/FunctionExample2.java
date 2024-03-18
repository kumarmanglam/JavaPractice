package org.javaCore.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
    public static void main(String[] args) {
        List<Customer> list = new ArrayList<>();

        list.add(new Customer("kumar", 32,"mobile"));
        list.add(new Customer("mohak", 3,"mobile"));
        list.add(new Customer("guru", 21,"mobile"));
        list.add(new Customer("jio", 13,"mobile"));
        list.add(new Customer("Nahak", 17,"mobile"));

        Function<Customer, String> p = o -> o.getName();

        Predicate<Customer> t = i -> i.getAge()>13;

        for(Customer c: list){
            if(t.test(c)){
                System.out.println(p.apply(c));
            }
        }
    }
}

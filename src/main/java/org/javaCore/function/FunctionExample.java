package org.javaCore.function;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
//        Function<String, Integer> f = i -> i.length();
//        System.out.println(f.apply("news and sports"));

        Function<Customer, Boolean> x= ob -> ob.age>18;

        Customer a = new Customer("rohan", 23, "samsung");

        System.out.println(x.apply(a));
    }
}

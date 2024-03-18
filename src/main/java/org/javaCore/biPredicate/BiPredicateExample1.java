package org.javaCore.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;
        System.out.println(biPredicate.test("HelloJava World", 9));

         BiPredicate<Integer, Integer> p = (a, b) -> { return (a + b) > 0; };
         System.out.println(p.test(10, 20));
         System.out.println(p.test(5, 20));
    }
}

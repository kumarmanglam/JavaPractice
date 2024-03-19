package org.javaCore.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;
        System.out.println(biPredicate.test("HelloJava World", 9));

         BiPredicate<Integer, Integer> p1 = (a, b) -> { return (a + b) > 0; };
         System.out.println(p1.test(10, 20));
         System.out.println(p1.test(5, -2020));

        BiPredicate<Integer,Integer> p2 = (a,b)->a*b>100;
        System.out.println(p1.and(p2).test(2,3));
        System.out.println(p1.or(p2).test(2,3));
        BiPredicate<Integer,Integer> pn = p1.negate();
        System.out.println(pn.test(234,789));
    }
}

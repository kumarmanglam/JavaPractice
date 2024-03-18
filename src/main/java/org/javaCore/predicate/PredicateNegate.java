package org.javaCore.predicate;

import java.util.function.Predicate;

public class PredicateNegate {

    public static void main(String[] args) {
        Predicate<Integer> p = i -> i%2==0;

        Predicate<Integer> negatePredicate = p.negate();

        System.out.println(negatePredicate.test(33));
    }
}

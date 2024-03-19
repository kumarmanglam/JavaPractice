package org.javaCore.predicate;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        PredicateTest test = new PredicateTest();
        System.out.println(test.isEligible(22));
    }

    private boolean isEligible(int age){
        return age>=18;
    }

//    public static void main(String[] args) {
//        Predicate<Integer> t = i -> i>=18;
//
//        System.out.println(t.test(3));
//    }
}

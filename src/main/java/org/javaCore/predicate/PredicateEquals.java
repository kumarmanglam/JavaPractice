package org.javaCore.predicate;

import java.util.function.Predicate;

public class PredicateEquals {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("kumar");
        System.out.println(p.test("kumar"));
        System.out.println(p.test("anish"));
    }
}

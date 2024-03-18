package org.javaCore.consumer;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        Consumer<String> c1 = i -> System.out.println(i+ " programmer!");
        Consumer<String> c2 = i -> System.out.println(i+ " coder!");
//        c1.accept("welcome");
        c2.andThen(c1).accept("Welcome -> ");
    }
}

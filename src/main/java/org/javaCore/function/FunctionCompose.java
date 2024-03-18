package org.javaCore.function;

import java.util.function.Function;

public class FunctionCompose {
    public static void main(String[] args) {
        Function<String, Integer> f = s -> s.length();  // length
        Function<Integer, Integer> f2 = i -> i*i; // length*2

        System.out.println(f2.compose(f).apply("house"));
    }
}

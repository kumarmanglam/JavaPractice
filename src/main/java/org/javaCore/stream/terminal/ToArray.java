package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToArray {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("Tom", "Gerry", "PawPatral", "Disny").stream();

        // Using method reference
        String[] result = stream.toArray(String[]::new);
        System.out.println(Arrays.toString(result));

        // Using lambda expression
        String[] lambdaResult = stream.toArray(size -> new String[size]);
        System.out.println("lambdaResult " + Arrays.toString(lambdaResult));
    }
}

package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.List;
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


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Stream<Integer> numberStream = numbers.stream();
        // Using BaseStream.parallel()
        Stream<Integer> parallelStream1 = numberStream.parallel();

        // Using Collection.parallelStream()
        Stream<Integer> parallelStream2 = numbers.parallelStream();
    }
}

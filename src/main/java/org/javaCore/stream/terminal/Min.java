package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Min {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 3, 7, 2);

        // Using min() with natural ordering
        Optional<Integer> min = numbers.stream().min(Comparator.naturalOrder());
        min.ifPresent(System.out::println); // Prints the minimum element

        // Using min() with a custom comparator
        Optional<Integer> minCustom = numbers.stream().min(Comparator.reverseOrder());
        minCustom.ifPresent(System.out::println); // Prints the minimum element using reverse ordering
    }
}

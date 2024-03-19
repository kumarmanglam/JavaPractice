package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Using reduce()
        int sum = numbers.stream().reduce(100, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum); // Prints "Sum of numbers: 15"

        // Using reduce() with different accumulator
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product of numbers: " + product); // Prints "Product of numbers: 120"
    }
}

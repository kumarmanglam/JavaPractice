package org.javaCore.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReduceExample {
    public static void main(String[] args) {
        // Create a stream of integers
        Stream<Integer> stream = Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        // Use reduce to find the sum of elements
        int sum = stream.reduce(100, (acc, num) -> acc + num);

        // Print the result
        System.out.println("Sum of elements: " + sum); // Output: Sum of elements: 15
    }
}

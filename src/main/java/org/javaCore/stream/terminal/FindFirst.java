package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class FindFirst {
    public static void main(String[] args) {
        Stream<String> stream = Arrays.asList("apple", "banana", "orange").stream();

        // Using findFirst()
        Optional<String> firstElement = stream.findFirst();
        firstElement.ifPresent(System.out::println); // Prints the first element

        // Using findFirst() on an empty stream
        Stream<String> emptyStream = Stream.empty();
        Optional<String> firstEmptyElement = emptyStream.findFirst();
        System.out.println(firstEmptyElement);
        firstEmptyElement.ifPresentOrElse(System.out::println, () -> System.out.println("Stream is empty")); // Prints "Stream is empty"
    }
}

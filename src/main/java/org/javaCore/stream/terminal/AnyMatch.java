package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using anyMatch()
        boolean anyGreaterThanThree = numbers.stream().anyMatch(num -> num > 3);
        System.out.println("Any number greater than three? " + anyGreaterThanThree); // Prints "Any number greater than three? true"

        // Using anyMatch() on an empty stream
        List<Integer> emptyList = Arrays.asList();
        boolean anyMatchEmpty = emptyList.stream().anyMatch(num -> num > 0);
        System.out.println("Any match in empty list? " + anyMatchEmpty); // Prints "Any match in empty list? false"
    }
}

package org.javaCore.stream.terminal;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using noneMatch()
        boolean noneGreaterThanFive = numbers.stream().noneMatch(num -> num > 5);
        System.out.println("None greater than five? " + noneGreaterThanFive); // Prints "None greater than five? true"

        // Using noneMatch() on an empty stream
        List<Integer> emptyList = Arrays.asList();
        boolean noneMatchEmpty = emptyList.stream().noneMatch(num -> num > 0);
        System.out.println("None match in empty list? " + noneMatchEmpty); // Prints "None match in empty list? true"
    }
}

package org.javaCore.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 2, 4, -11, 3, -7, 5, 9, 6, 8);

        // Using an anonymous class
        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1); // Reverse comparison
            }
        };

        List<Integer> sortedList = list.stream()
                .sorted(reverseComparator)
                .collect(Collectors.toList());
        System.out.println(sortedList);

        // Using Lambda expressions
        List<Integer> sortedList1 = list.stream()
                .sorted((i1, i2) -> i2.compareTo(i1)) // Reverse comparison using lambda
                .collect(Collectors.toList());
        System.out.println(sortedList1);
    }
}

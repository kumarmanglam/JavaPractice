package org.javaCore.stream.distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "A", "B", "", "XY", "NZ", "YZ", "XY");
        List<String> distinctChars = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctChars);
    }

}

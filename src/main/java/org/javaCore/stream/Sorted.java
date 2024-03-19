package org.javaCore.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,5,6,332,43);

        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());

        System.out.println(collect);

    }
}

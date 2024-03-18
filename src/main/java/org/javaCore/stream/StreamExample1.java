package org.javaCore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,5,6,332,43);

        List<Integer> collect = list.stream().filter(item -> item > 32).collect(Collectors.toList());

        System.out.println(collect);
    }
}

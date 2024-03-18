package org.javaCore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,5,6,332,43);

        List<Integer> collect = list.stream().skip(4).collect(Collectors.toList());

        List<Integer> collect2 = list.stream().skip(-4).collect(Collectors.toList()); // illegal argument exception

        System.out.println(collect);

    }
}

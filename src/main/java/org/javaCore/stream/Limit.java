package org.javaCore.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {
    public static void main(String[] args) {
        Stream<Integer> st = Stream.iterate(0, n-> n+3); // infinite
        List<Integer> list = st.limit(10).collect(Collectors.toList());
        System.out.println(list);
    }
}

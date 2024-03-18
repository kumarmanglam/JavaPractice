package org.javaCore.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SkipExample2 {

    public static void main(String[] args) {
        Stream<Integer> st = Stream.iterate(0, n-> n+3);
        List<Integer> list = st.skip(20).limit(10).collect(Collectors.toList());
        System.out.println(list);
    }
}


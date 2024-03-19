package org.javaCore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,2,5,6,332,43);

        Stream<Integer> result = list.stream();

//        System.out.println(result);

        Stream<Integer> mod1 = result.filter(item -> item>20);

        Stream<Integer> mod2 = mod1.filter(item->item%2==0);

        List<Integer> ans = mod2.collect(Collectors.toList());
        System.out.println(ans);
//        List<Integer> collect = list.stream().filter(item -> item > 32).collect(Collectors.toList());
//
//        System.out.println(collect);
    }
}

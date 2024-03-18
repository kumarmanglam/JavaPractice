package org.javaCore.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //unmodifiable list
        List<Integer> list1 = List.of(2,3,4,5,6,98,34,23);

        //even nos using Stream
        //using stream
        Stream<Integer> stream = list1.stream();
        Stream<Integer> filter = stream.filter(a -> a%2==0); //
        System.out.println(filter);// Print each element of the stream using forEach
        filter.forEach(System.out::println);
//        List<Integer> collect = filter.collect(Collectors.toList()); //
//        System.out.println(collect);


        List<Integer>  list = Arrays.asList(12,3,5,6,64,34,6,34,5,659,90);

        System.out.println(list.stream().distinct().collect(Collectors.toList()));
    }
}

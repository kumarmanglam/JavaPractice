package org.javaCore.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> list3 = Arrays.asList(7, 8, 9);
        List<Integer> list4 = Arrays.asList(10, 11, 12);

        List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3, list4);
        System.out.println(listOfList);
        List<Integer> result = listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
//        List<Integer> result = listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(result);
    }
}

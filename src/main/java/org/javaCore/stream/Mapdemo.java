package org.javaCore.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo {
    public static void main(String[] args) {
       List<Integer> arr =Arrays.asList(1,2,3,4);
       List<Integer> res = arr.stream().map((item) -> item*2).collect(Collectors.toList());
        System.out.println(res);

        List<String> names = Arrays.asList("John", "Mike", "Peter", "Raju");

        System.out.println(names.stream().map(String::length).collect(Collectors.toList()));
    }
}

package org.javaCore.stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample3 {
    public static void main(String[] args) {
        List<Integer>  list = Arrays.asList(12,3,5,6,64,34,6,34,5,659,90);
        int maxValue = list.stream().filter(item -> item%2==0).max(Integer::compare).get();
        System.out.println(list.stream().filter(item -> item % 2 == 0).anyMatch((item) -> item == 6));
//        int maxValue = list.stream().filter(item -> item%2==0).max((a,b) -> a-b).get();
        System.out.println(maxValue);
    }
}

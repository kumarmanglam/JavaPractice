package org.javaCore.supplier;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierDemo {
    public static void main(String[] args) {
        String str = "welcome to java";
        Supplier<String> supplier = () -> str.concat(" world");
        System.out.println(supplier.get()); // welcome to java world

        int[] nums = {10, 5, 20, 90, 234, 43, 23, 53, 76, 39};
        Supplier<Integer> numberSupplier = () -> {
            int min = 1;
            int max = 10;
            int random = (int) (Math.random() * (max - min)) + min;
            return nums[random];
        };

        System.out.println("Random number is " + numberSupplier.get());
        System.out.println("Random number is " + numberSupplier.get());
        System.out.println("Random number is " + numberSupplier.get());
//        Stream<Object>

    }
}

package org.javaCore.functionalInterface;

@FunctionalInterface
interface PredicateInter{
    boolean func(int age);
}

public class practice {
    public static void main(String[] args) {
        PredicateInter x= (a) -> {
            if(a>18) return true;
            else return false;
        };
        System.out.println(x.func(20));
        System.out.println(x.func(10));
    }
}

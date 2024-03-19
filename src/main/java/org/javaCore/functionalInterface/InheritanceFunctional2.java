package org.javaCore.functionalInterface;

/*
*  In the Child interface we can define exactly same
* then both the interfaces are functional interfaces
* */

@FunctionalInterface
interface Interf1 {
    public int multiply(int a);
}


interface Interf2 extends Interf1{
    public int multiply(int a);
//    public int division(int a);
}

public class InheritanceFunctional2 {
    public static void main(String[] args) {
        Interf2 i = (a) -> a*a*a;
        Interf2 j = (a) -> a*a;
        int result = i.multiply(5);
        int res2 = j.multiply(5);
        System.out.println(result); // 125
        System.out.println(res2); // 25
    }
}

package org.javaCore.functionalInterface;


@FunctionalInterface
interface A {
    public void display();
}

interface B extends A{

}

public class InheritanceFunctionalInterface {
    public static void main(String[] args) {
        A demo = () -> System.out.println("display function called from A");
        demo.display();

        B demo2 = () -> System.out.println("display function called from B");
        demo2.display();
    }
}

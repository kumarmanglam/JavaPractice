package org.javaCore.functionalInterface;

@FunctionalInterface
interface C {
    public void display();
}

public class basicFunctionInheritance {
    public static void main(String[] args) {
        C demo = () -> System.out.println("display function called");
        demo.display();
    }
}

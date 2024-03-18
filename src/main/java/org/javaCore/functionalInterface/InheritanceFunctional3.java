package org.javaCore.functionalInterface;

/*
 * In the child interface, we can't define any new abstract methods; otherwise, the child interface won't be a functional interface.
 * The compiler throws an exception "Invalid @FunctionalInterface" annotation.
 * */

@FunctionalInterface
interface Interf4{
    public int multiplyby3(int a);
}

//@FunctionalInterface
//interface Interf5 extends Interf4{
//    public int square(int a);
//}

// Even though Interf5 defines a new method square(), it's won't be functional interface
// because it inherits the single abstract method from its parent interface Interf4.
interface Interf5 extends Interf4{
    public int square(int a);
}

class Test implements Interf5{

    @Override
    public int multiplyby3(int a) {
        return a*3;
    }

    @Override
    public int square(int a) {
        return a*a;
    }
}

public class InheritanceFunctional3 {
    public static void main(String[] args) {
        Interf4 i = a -> a*3;
        System.out.println(i.multiplyby3(10));
//        Interf5 i3 = a -> a*3;
//        Interf5 k = a -> a*a;
        Test c = new Test();
        System.out.println(c.square(2));
    }
}

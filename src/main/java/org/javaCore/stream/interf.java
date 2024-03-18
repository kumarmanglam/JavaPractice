package org.javaCore.stream;

import java.util.Objects;

@FunctionalInterface
public interface interf {
    public int done();
    boolean equals(Object obj);
}

class some implements interf{

    String name;

    public some() {
    }

    public some(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        some some = (some) o;
        return Objects.equals(name, some.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int done() {
        return 1;
    }

    public static void main(String[] args) {
        some some1 = new some("k");
        some some2 = new some("k");
        System.out.println(some1 == some2);   // two different memory addresses
        System.out.println(some1.equals(some2)); // equals overrriden
    }
}

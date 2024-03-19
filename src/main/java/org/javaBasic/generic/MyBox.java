package org.javaBasic.generic;

import java.util.Stack;

public class MyBox<T>{
    T val;

    public MyBox(T val) {
        this.val = val;
    }

    public void display(){
        System.out.println(val);
    }

    public static void main(String[] args) {
        MyBox<String> box = new MyBox<>("Kumar");
        box.display();

        MyBox<Double> box2 = new MyBox<>(8997.98);
        box2.display();


//        Stack<Integer> s = new Stack<>();
    }
}

package org.javaBasic.generic;

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
    }
}

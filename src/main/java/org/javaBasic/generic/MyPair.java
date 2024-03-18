package org.javaBasic.generic;

public class MyPair <K,V>{
    K x;
    V y;

    public MyPair(K x, V y) {
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println(x + "  "+ y);
    }

    public static void main(String[] args) {
        MyPair<String, Integer> m1 = new MyPair<>("key", 23);
        m1.display();
    }
}

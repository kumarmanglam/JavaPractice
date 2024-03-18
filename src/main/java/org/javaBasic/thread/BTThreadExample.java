package org.javaBasic.thread;

public class BTThreadExample {
    // This  is anonymous Interface Implementation
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Hello");
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " Hello");
            }
        },  "Custom Name");
        t2.start();
    }
}

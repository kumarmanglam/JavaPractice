package org.javaBasic.thread;

public class CcreateThread {
    public static void main(String[] args) {
        Thread th = new Thread("Thread name");
        th.start();
        System.out.println(th.getName());
    }
}

package org.javaBasic.thread;

// It can be created by extending the Thread class and overriding its run() method
public class AThread extends Thread {
    public void run(){
        System.out.println("AThread ran");
    }
}
// Thread has a method called start to execute a Thread
class Demo{
    public static void main(String[] args) {
        AThread t1 = new AThread();
        t1.start();
    }
}

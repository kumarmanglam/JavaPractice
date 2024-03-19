package org.javaBasic.thread;

public class JThreadPriorityExample extends Thread{
    public void run(){
        System.out.println("Running " + Thread.currentThread().getName());
    }
}

class demo8{
    public static void main(String[] args) {
        JThreadPriorityExample ex1 = new JThreadPriorityExample();
        JThreadPriorityExample ex2 = new JThreadPriorityExample();
        JThreadPriorityExample ex3 = new JThreadPriorityExample();

        // priority range is 1 to 10
        ex1.setPriority(10);
        ex2.setPriority(1);
        ex3.setPriority(3);
// 1 3 2
        ex1.start();
        ex2.start();
        ex3.start();
    }
}



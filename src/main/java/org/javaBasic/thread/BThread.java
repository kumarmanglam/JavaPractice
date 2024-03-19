package org.javaBasic.thread;
// Another way to create a thread is to implement the Runnable interface
// If the class extends the Thread class, the thread can be run by creating
// an instance of the class and call its start() method
public class BThread implements Runnable{
    @Override
    public void run() {
        System.out.println("BThread ran "+ Thread.currentThread().getName());
    }
}

class Demo2{
    public static void main(String[] args) {
        BThread b1 = new BThread();
        Thread th = new Thread(b1);
        th.start();

        // or we can write
        Thread t3 = new Thread(new BThread());
        t3.start();

        // second Method
        BThread b2 = new BThread();
        Thread t2 = new Thread(b2, "Method 2 name");
        t2.start();
    }
}

package org.javaBasic.thread;

public class GThreadRunExample extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

class demo6 {
    public static void main(String args[]) {
        GThreadRunExample t1 = new GThreadRunExample();
        GThreadRunExample t2 = new GThreadRunExample();
//        t1.run();
//        t2.run();
        // what is the difference run and start here?
        // In this case, t1.run() and t2.run() will execute
        // sequentially in the main thread, not concurrently in separate threads.
        t1.start();
        t2.start();
    }
}
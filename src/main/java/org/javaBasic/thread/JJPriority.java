package org.javaBasic.thread;
class MyThread implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
    }
}
public class JJPriority {
    public static void main(String[] args) {
//        Thread th1 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "th1");
//        Thread th2 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "th2");
//        Thread th3 = new Thread(() -> System.out.println(Thread.currentThread().getName()), "th3");
//        th1.setPriority(5);
//        th2.setPriority(2);
//        th3.setPriority(8);
        // th3 th1 th2
//        th1.start();
//        th2.start();
//        th3.start();

        MyThread m1 = new MyThread();
        Thread th1 = new Thread(m1,"m1");
        MyThread m2 = new MyThread();
        Thread th2 = new Thread(m1,"m2");
        MyThread m3 = new MyThread();
        Thread th3 = new Thread(m1,"m3");

        th1.setPriority(5);
        th2.setPriority(2);
        th3.setPriority(8);
        // m3 m1 m2
        th1.start();
        th2.start();
        th3.start();
    }
}

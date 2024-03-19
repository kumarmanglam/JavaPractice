package org.javaBasic.thread;

public class EThreadExample extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName()+ " after 3 seconds");
    }

}

class demo4{
    public static void main(String[] args) {
        EThreadExample th = new EThreadExample();
        th.start();
        EThreadExample th2 = new EThreadExample();
        th2.start();
    }
}

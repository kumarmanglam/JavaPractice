package org.javaBasic.thread;

public class IThreadJoin extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class demo7{
    public static void main(String[] args) throws InterruptedException {
        IThreadJoin i1 = new IThreadJoin();
        IThreadJoin i2 = new IThreadJoin();
        i1.start();
        i1.join();
        i2.start();
    }
    //The join() method in Java is provided by the java.lang.Thread class
    // that permits one thread to wait until the other thread to finish its execution

    // When the join() method is invoked, the current thread stops its execution and
    // the thread goes into the wait state
}

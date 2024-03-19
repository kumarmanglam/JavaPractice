package org.javaBasic.thread;
// both threads are waiting for each other to release the lock,
// the condition is called deadlock.
public class ODeadlock extends Thread{
    private Object ob1;
    private Object ob2;

    public ODeadlock(Object ob1, Object ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    public void run(){
        synchronized (ob1){
            sleepEx();
            System.out.println("Locked Resource 1");
            synchronized (ob2){
                sleepEx();
                System.out.println("Locked Resource 2");
            }
            System.out.println("Realised Resource 2");
        }
        System.out.println("Realised Resource 1");
    }

    public void sleepEx()  {
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class demo10{
    public static void main(String[] args) throws InterruptedException {
        Object ob1 = new Object();
        Object ob2 = new Object();
        Object ob3 = new Object();

        ODeadlock th1 = new ODeadlock(ob1, ob2);
        ODeadlock th2 = new ODeadlock(ob2, ob3);
        ODeadlock th3 = new ODeadlock(ob3, ob1);

        th1.start();
        Thread.sleep(4000);
        th2.start();
        Thread.sleep(4000);
        th3.start();
    }
}
package org.javaBasic.thread;

public class DThreadExample extends Thread{
    public void run(){
        for(int i=0; i<50; i++){
            System.out.println(Thread.currentThread().getName()+"value " +i);
        }
    }
}

class Demo3{
    public static void main(String[] args) {
        DThreadExample th2 = new DThreadExample();
        th2.start();

        DThreadExample th3 = new DThreadExample();
        th3.start();
    }
}

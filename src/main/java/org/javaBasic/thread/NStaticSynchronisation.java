package org.javaBasic.thread;
class Table3{
    synchronized static void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
        }
    }
}

class Th1 extends Thread{
    public void run(){
        Table3.printTable(3);
    }
}

class Th2 extends Thread{
    public void run(){
        Table3.printTable(4);
    }
}

public class NStaticSynchronisation {
    public static void main(String[] args) {
        Th1 th1 = new Th1();
        Th2 th2 = new Th2();
        th1.start();
        th2.start();
    }
}

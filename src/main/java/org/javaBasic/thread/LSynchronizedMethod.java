package org.javaBasic.thread;
class Table {
    synchronized void printTable(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i*num);
        }
    }
}

class Thread1 extends Thread{
    Table t;
    Thread1(Table obj){
        this.t = obj;
    }

    public void run(){
        t.printTable(10);
    }
}

class Thread2 extends Thread{
    Table t;
    Thread2(Table obj){
        this.t = obj;
    }

    public void run(){
        t.printTable(3);
    }
}



public class LSynchronizedMethod {
    public static void main(String[] args) {
        Table table = new Table();
        Thread1 t1 = new Thread1(table);
        Thread1 t2= new Thread1(table);
//        t1.start();
//        t2.start();


        Thread1 t3 = new Thread1(table);
        Thread2 t4= new Thread2(table);
        t3.start();
        t4.start();
    }
}

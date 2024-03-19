package org.javaBasic.thread;
class Table2{
    void printTable(int num){
        synchronized (this){ // synchronised Block
            for (int i = 1; i <= 10; i++) {
                System.out.println(i*num);
            }
        }
    }
}

class ThreadExample extends Thread{
    Table2 obj;
    ThreadExample(Table2 ob){
        this.obj =ob;
    }
    public void run(){
        obj.printTable(2);
    }
}
public class MSynchronizedBlock {
    public static void main(String[] args) {
        // it disallows interference when same object is passed to diff threads
        Table2 t2 = new Table2(); // shared resource
        ThreadExample t1 = new ThreadExample(t2);
        ThreadExample t22 = new ThreadExample(t2);
        t1.start();
        t22.start();
    }
}



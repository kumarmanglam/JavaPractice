package org.javaBasic.thread;
class Table2{
    void printTable(int num){
        synchronized (this){ // synchronised Block
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
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
        Table2 t2 = new Table2();
        ThreadExample t1 = new ThreadExample(t2);
        ThreadExample t22 = new ThreadExample(t2);
        t1.start();
        t22.start();
    }
}
git config --global user.email "kumarmanglamemail@gmail.com"
git config --global user.name "kumarmentalmodel"


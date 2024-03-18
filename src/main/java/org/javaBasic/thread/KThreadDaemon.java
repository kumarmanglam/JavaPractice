package org.javaBasic.thread;

// Daemon thread in Java is a service provider thread that provides services
// to the user thread. Its life depend on the mercy of user threads i.e.
// when all the user threads dies, JVM terminates this thread automatically
public class KThreadDaemon extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            for (int i = 0; i < 10; i++) {
                System.out.println("Daemon Thread " + i);
            }
        }else{
            for (int i = 0; i < 3; i++) {
                System.out.println("Normal Thread "+ i);
            }
        }
    }
}

class demo9{
    public static void main(String[] args) {
        KThreadDaemon k1 = new KThreadDaemon();
        KThreadDaemon k2 = new KThreadDaemon();
        KThreadDaemon k3 = new KThreadDaemon();
        k1.setDaemon(true);
        k1.start();
        k2.start();
        k3.start();
        // Daemon Thread could not print till 10
    }
}

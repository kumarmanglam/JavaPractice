package org.javaBasic.thread;

// Class representing a thread example
public class FThreadExample extends Thread {

    // Method that will be executed when the thread starts
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                // Introducing a sleep of 100 milliseconds to simulate some processing time
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // Exception handling
                throw new RuntimeException(e);
            }
            // Printing thread name and a counter variable
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

// Main class to demonstrate thread usage
class demo5 {
    public static void main(String[] args) {
        // Creating and starting two instances of the FThreadExample class, representing threads
        FThreadExample f1 = new FThreadExample();
        f1.start();
        FThreadExample f2 = new FThreadExample();
        f2.start();

        // The threads f1 and f2 will execute concurrently, independently of each other
        // There is no synchronization between these threads, meaning they are not coordinated in any way
        // Each thread executes its run() method independently, resulting in interleaved console output
        // Due to the sleep operation in the run() method, threads might pause execution, allowing other threads to run
        // This leads to non-deterministic output order, as the operating system scheduler decides when each thread gets CPU time
    }
}
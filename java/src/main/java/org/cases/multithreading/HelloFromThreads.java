package org.cases.multithreading;

public class HelloFromThreads {

    public void printHelloByFiveThreads() {
        for (int i = 1; i < 5; i++) {
            final int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Hi from the Thread" + threadNumber);
            });

            thread.start();
        }
    }

}

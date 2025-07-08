package org.cases.multithreading;

public class ThreadCreation {

    public void createThread() throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1- " + Thread.currentThread().getName());
            }
        });

        thread.setName("not main");

        // before starting main thread
        System.out.println("2 - " + Thread.currentThread().getName());
        thread.start();
        thread.join();

        //after starting new thread
        System.out.println("3 - " + Thread.currentThread().getName());
    }

}

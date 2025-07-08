package org.cases.multithreading;

public class Incrementer extends Thread {

    private final Counter counter;

    public Incrementer(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.inc();
        }
    }
}

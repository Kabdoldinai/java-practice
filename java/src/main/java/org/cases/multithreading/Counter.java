package org.cases.multithreading;

// Race Condition without synchronized
public class Counter {
    private int i = 0;
    Object lock = new Object();

    public void inc() {
        synchronized (this.lock) {
            i++;
        }
    }

    public void dec() {
        synchronized (this.lock) {
            i--;
        }

    }

    public int get() {
        return this.i;
    }
}

package org.cases.multithreading.tinkoff;

public class Leg implements Runnable {

    private final String name;
    private final Object lock;
    private boolean left;
    private static boolean leftStep = true;
    private int count = 0;

    public Leg(String name, Object lock, boolean left) {
        this.name = name;
        this.lock = lock;
        this.left = left;
    }

    @Override
    public void run() {

        while (count < 5) {
            synchronized (lock) {
                while (leftStep != left) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.println(name);

                leftStep = !leftStep;
                lock.notifyAll();
                count++;
            }
        }
    }

}


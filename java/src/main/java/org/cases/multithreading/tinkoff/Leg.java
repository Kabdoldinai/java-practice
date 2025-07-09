package org.cases.multithreading.tinkoff;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Leg implements Runnable {

    private final String name;
    private boolean left;
    private int count = 0;
    private static final Lock lock = new ReentrantLock();
    private static final Condition rightStepCondition = lock.newCondition();
    private static boolean leftStep = true;

    public Leg(String name, boolean left) {
        this.name = name;
        this.left = left;
    }

    @Override
    public void run() {

        while (count < 5) {
            lock.lock();
            try {
                while (leftStep != left) {
                    rightStepCondition.await();
                }
                System.out.println(name);
                leftStep = !leftStep;
                rightStepCondition.signalAll();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }

            count++;
        }
    }

}


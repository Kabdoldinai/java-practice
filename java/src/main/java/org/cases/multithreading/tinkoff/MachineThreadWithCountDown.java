package org.cases.multithreading.tinkoff;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class MachineThreadWithCountDown implements Runnable {

    private final int workerId;
    private final Machine machine;
    private final Semaphore semaphore;
    private final CountDownLatch countDownLatch;

    public MachineThreadWithCountDown(int workerId, Machine machine, Semaphore semaphore, CountDownLatch countDownLatch) {
        this.workerId = workerId;
        this.machine = machine;
        this.semaphore = semaphore;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            machine.workOnMachine(workerId);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
            countDownLatch.countDown();
        }
    }

}

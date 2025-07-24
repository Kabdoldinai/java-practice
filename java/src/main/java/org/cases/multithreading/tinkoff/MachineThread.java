package org.cases.multithreading.tinkoff;

import java.util.concurrent.Semaphore;

public class MachineThread implements Runnable {

    private final int workerId;
    private final Machine machine;
    private final Semaphore semaphore;

    public MachineThread(int workerId, Machine machine, Semaphore semaphore) {
        this.workerId = workerId;
        this.machine = machine;
        this.semaphore = semaphore;
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
        }

    }

}

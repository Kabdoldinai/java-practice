package org.cases.multithreading.tinkoff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class MachineService {

    public void runProductionShift(int workers, int machines) {
        Machine machine = new Machine();
        Semaphore semaphore = new Semaphore(machines);
        ExecutorService executor = Executors.newFixedThreadPool(workers);

        for (int i = 1; i <= workers; i++) {
            executor.submit(new MachineThread(i, machine, semaphore));
        }

        executor.shutdown();
    }
}

package org.cases;

import org.cases.multithreading.tinkoff.MachineService;

public class Main {

    public static void main(String[] args) {

        MachineService machineService = new MachineService();
        machineService.runProductionShift(8, 5);

    }
}

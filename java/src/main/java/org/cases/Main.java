package org.cases;

import org.cases.multithreading.HelloFromThreads;

public class Main {

    public static void main(String[] args) {

        HelloFromThreads helloFromThreads = new HelloFromThreads();

        helloFromThreads.printHelloByFiveThreads();

    }
}
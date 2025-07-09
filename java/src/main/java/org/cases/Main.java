package org.cases;

import org.cases.multithreading.tinkoff.Leg;

import java.util.concurrent.CompletableFuture;

public class Main {



    public static void main(String[] args) {
        Object lock = new Object();

        CompletableFuture.allOf(
                CompletableFuture.runAsync(new Leg("left", lock, true)),
                CompletableFuture.runAsync(new Leg("right", lock, false))
        ).join();
    }
}

package org.cases;

import org.cases.multithreading.tinkoff.Leg;

import java.util.concurrent.CompletableFuture;

public class Main {



    public static void main(String[] args) {
        CompletableFuture.allOf(
                CompletableFuture.runAsync(new Leg("left", true)),
                CompletableFuture.runAsync(new Leg("right", false))
        ).join();
    }
}

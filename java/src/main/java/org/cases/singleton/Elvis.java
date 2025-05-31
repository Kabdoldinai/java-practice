package org.cases.singleton;

public class Elvis {

    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {}

    // static fabric
    public static Elvis getInstance() {
        return INSTANCE;
    }
}

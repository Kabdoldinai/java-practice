package org.cases.singleton;


/**
 * Even though the constructor is private - it can be hacked by Java Reflection API
 */
public class Singleton {

    public static final Singleton INSTANCE = new Singleton();
    // final -нельзя заменить экземпляр
    private static boolean instanceCreated = false;

    private Singleton() {
        if (instanceCreated) {
            throw  new RuntimeException("USE INSTANCE ONLY");
        }
        instanceCreated = true;
    }

    public void doSomething() {
        System.out.println("I am single");
    }

}

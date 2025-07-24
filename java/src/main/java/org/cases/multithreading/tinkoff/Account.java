package org.cases.multithreading.tinkoff;

public class Account {

    private int cacheBalance;
    private int id;

    public Account(int id, int cacheBalance) {
        this.id = id;
        this.cacheBalance = cacheBalance;
    }

    public void addMoney(int money) {
        cacheBalance += money;
    }

    public boolean takeOffMoney(int money) {
        if (this.cacheBalance > money) {
            this.cacheBalance -= money;
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public int getCacheBalance() {
        return cacheBalance;
    }

}

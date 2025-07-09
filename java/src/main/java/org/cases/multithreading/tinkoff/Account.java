package org.cases.multithreading.tinkoff;

public class Account {

    private int cacheBalance;

    public Account(int cacheBalance) {
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

    public int getCacheBalance() {
        return cacheBalance;
    }

}
